package com.phaete;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String value;

    DaysOfWeek(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
