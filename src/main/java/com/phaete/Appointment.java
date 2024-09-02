package com.phaete;

import java.util.Objects;

public class Appointment {
    String name;
    WeekDays day;

    public Appointment(String name, WeekDays day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeekDays getDay() {
        return day;
    }

    public void setDay(WeekDays day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(name, that.name) && day == that.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, day);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "name='" + name + '\'' +
                ", day=" + day +
                '}';
    }
}
