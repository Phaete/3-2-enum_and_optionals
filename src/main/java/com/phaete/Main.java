package com.phaete;

public class Main {
    public static void main(String[] args) {

//        Appointment appointment = new Appointment(
//                "Birthday Max",
//                WeekDays.THURSDAY
//        );
//        System.out.println(appointment);
//
//        // To get the day in natural language format, so capitalize the first letter, we need to not print the enum, but enum.getValue()
//        System.out.println(appointment.getName() + " on " + appointment.getDay().getValue());
//
//        checkDay(appointment.getDay());

//        Service service = new Service();
//
//        System.out.println(service.getArticleNameById("1"));
//        System.out.println(service.getArticleNameById("10"));

        PersonRepository personRepository = new PersonRepository();
        personRepository.addPerson(new Person(1, "Max", DaysOfWeek.MONDAY, Gender.MALE));
        personRepository.addPerson(new Person(2, "Maxine", DaysOfWeek.SUNDAY, Gender.FEMALE));

        if (personRepository.getPersonById(1).isPresent()) {
            System.out.println(personRepository.getPersonById(1).get().name() + "'s favorite day is " + personRepository.getPersonById(1).get().favoriteDay().getValue());
        }
        if (personRepository.getPersonById(2).isPresent()) {
            System.out.println(personRepository.getPersonById(2).get().name() + "'s favorite day is " + personRepository.getPersonById(2).get().favoriteDay().getValue());
        }
        if (personRepository.getPersonById(4).isPresent()) {
            System.out.println(personRepository.getPersonById(2).get().name() + "'s favorite day is " + personRepository.getPersonById(2).get().favoriteDay().getValue());
        }

        System.out.println(personRepository.getPersonCountByGender());
    }

    public static void checkDay(WeekDays day) {
        if(day.isWeekend()) {
            System.out.println("Learning!");
        } else {
            System.out.println("Working!");
        }
    }

}