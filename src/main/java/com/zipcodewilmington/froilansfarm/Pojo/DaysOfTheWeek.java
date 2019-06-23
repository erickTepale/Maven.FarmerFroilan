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

    Farm farm = Farm.getINSTANCE();
    Storage storage = Storage.getInstance();
    Farmer froilan = new Farmer();
    Pilot froilanda = new Pilot();



    private void everyday() {
        froilan.rideAllHorses();
        froilan.feedAllHorses(new EarOfCorn() ,1);
        froilan.eat(new EarOfCorn(), 1);
        froilan.eat(new Tomato() , 2);
        froilan.eat(new EdibleEgg(), 5);
        froilanda.eat(new EarOfCorn(), 2);
        froilanda.eat(new Tomato() , 1);
        froilanda.eat(new EdibleEgg(), 2);
    }

    private void monday() {
       everyday();
       froilan.plant(new CornStalk(), farm.getField().getCropRow().get(0)); // need way to plant more than one
       froilan.plant(new TomatoPlant(), farm.getField().getCropRow().get(0));
       froilan.plant(new CornStalk(), farm.getField().getCropRow().get(0));
    }

    private void tuesday() {
        everyday();
        froilanda.operate(farm.getCropDuster());
        farm.getCropDuster().fertiilizes(farm.getField());
    }

    private void wednesday() {
        everyday();
        froilan.operate(farm.getTractor());
        farm.getTractor().harvest(farm.getField());
    }

    private void thrusday() {
        everyday();
    }

    private void friday() {
        everyday();
    }

    private void saturday() {
        everyday();
    }

    private void sunday() {
        everyday();
    }
}

