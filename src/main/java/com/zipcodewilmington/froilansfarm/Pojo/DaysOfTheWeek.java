package com.zipcodewilmington.froilansfarm.Pojo;

public enum DaysOfTheWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THRUSDAT(5),
    FRIDAY(6),
    SATURDAY(7);

    private Integer dayNumber;

    DaysOfTheWeek(Integer dayNumber){
        this.dayNumber = dayNumber;
    }
}
