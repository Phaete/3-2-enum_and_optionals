package com.phaete;

public enum WeekDays {
    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDAY("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true),
    SUNDAY("Sunday", true);

    private final String value;
    private final boolean weekend;

    WeekDays(String value, boolean weekend) {
        this.value = value;
        this.weekend = weekend;
    }


    public String getValue() {
        return value;
    }

    public boolean isWeekend() {
        return weekend;
    }
}
