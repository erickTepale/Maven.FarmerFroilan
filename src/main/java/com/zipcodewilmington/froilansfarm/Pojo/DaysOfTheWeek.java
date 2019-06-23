package com.zipcodewilmington.froilansfarm.Pojo;

import java.lang.reflect.Method;

public class DaysOfTheWeek{

    Farm farm = Farm.getINSTANCE();
    Storage storage = Storage.getInstance();
    Farmer froilan = new Farmer();
    Pilot froilanda = new Pilot();

    public void week(){
        sunday();
        monday();
        tuesday();
        wednesday();
        thrusday();
        friday();
        saturday();

    }

    public void everyday() {
        froilan.rideAllHorses();
        froilan.feedAllHorses(new EarOfCorn() ,1);
        froilan.eat(new EarOfCorn(), 1);
        froilan.eat(new Tomato() , 2);
        froilan.eat(new EdibleEgg(), 5);
        froilanda.eat(new EarOfCorn(), 2);
        froilanda.eat(new Tomato() , 1);
        froilanda.eat(new EdibleEgg(), 2);
    }

    public void monday() {
        everyday();
        froilan.plant(new CornStalk(), farm.getField().getCropRow().get(0), 5); //
        froilan.plant(new TomatoPlant(), farm.getField().getCropRow().get(0), 5);
        froilan.plant(new CornStalk(), farm.getField().getCropRow().get(0),5);
    }

    public void tuesday() {
        everyday();
        froilanda.operate(farm.getCropDuster());
        farm.getCropDuster().fertiilizes(farm.getField());
    }

    public void wednesday() {
        everyday();
        froilan.operate(farm.getTractor());
        farm.getTractor().harvest(farm.getField());
    }

    public void thrusday() {
        everyday();
        froilan.makenoise();

    }

    public void friday() {
        everyday();
    }

    public void saturday() {
        everyday();
    }

    public void sunday() {
        everyday();
    }
}





