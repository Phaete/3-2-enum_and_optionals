package com.phaete;

import java.util.*;

public class PersonRepository {
    private Map<Integer, Person> personRepo = new HashMap<>();

    public Optional<Person> getPersonById(Integer id) {
        return personRepo.containsKey(id) ? Optional.of(personRepo.get(id)) : Optional.empty();
    }

    public void addPerson(Person person) {
        personRepo.put(person.id(), person);
    }

    public Map<Gender, Integer> getPersonCountByGender() {
        Map<Gender, Integer> genderCount = new HashMap<>();

        for (Person person : personRepo.values()) {
            genderCount.put(person.gender(), genderCount.getOrDefault(person.gender(), 0) + 1);
        }

        return genderCount;
    }

    public Optional<Person> getPersonByName(String name) {
        for (Person person : personRepo.values()) {
            if (person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getPersonsByFavoriteDay(DaysOfWeek day) {
        List<Person> persons = new ArrayList<>();
        for (Person person : personRepo.values()) {
            if (person.favoriteDay().equals(day)) {
                persons.add(person);
            }
        }
        return persons;
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "personRepo=" + personRepo +
                '}';
    }
}

