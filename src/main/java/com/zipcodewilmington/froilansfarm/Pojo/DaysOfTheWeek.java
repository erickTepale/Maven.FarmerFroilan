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
        froilan.plant(new TomatoPlant(), farm.getField().getCropRow().get(1), 5);
        froilan.plant(new CornStalk(), farm.getField().getCropRow().get(2),5);
    }

    public void tuesday() {
        everyday();
        froilanda.mount(farm.getCropDuster());
        froilanda.operate(farm.getCropDuster());
        farm.getCropDuster().turnOn();
        farm.getCropDuster().ride();
        farm.getCropDuster().fertiilizes(farm.getField());
        farm.getCropDuster().land();
    }

    public void wednesday() {
        everyday();
        froilan.mount(farm.getTractor());
        froilan.operate(farm.getTractor());
        farm.getTractor().ride();
        farm.getTractor().turnOn();
        farm.getTractor().harvest(farm.getField());
        farm.getTractor().dismountVehicle();

    }

    public void thrusday() {
        everyday();
        froilan.makenoise();
        froilanda.makenoise();
        froilan.mount(farm.getStables()[0].getHorse(0));
        farm.getStables()[0].getHorse(0).makenoise();
        froilan.dismount(farm.getStables()[0].getHorse(0));
        froilan.plant(new CornStalk(), farm.getField().getCropRow().get(3), 5); //
        froilan.plant(new TomatoPlant(), farm.getField().getCropRow().get(4), 5); //


    }

    public void friday() {
        everyday();
        froilanda.mount(farm.getCropDuster());
        froilanda.operate(farm.getCropDuster());
        farm.getCropDuster().turnOn();
        farm.getCropDuster().ride();
        farm.getCropDuster().fertiilizes(farm.getField());
        farm.getCropDuster().land();
        farm.getCoops()[2].getChicken(0).yields(storage);
        farm.getCoops()[2].getChicken(1).yields(storage);
        farm.getCoops()[2].getChicken(2).yields(storage);
        farm.getCoops()[2].getChicken(3).yields(storage);
        farm.getCoops()[3].getChicken(0).yields(storage);
        farm.getCoops()[3].getChicken(1).yields(storage);
        farm.getCoops()[3].getChicken(2).yields(storage);
    }

    public void saturday() {
        everyday();
        farm.getCoops()[0].getChicken(0).yields(storage);
        farm.getCoops()[0].getChicken(1).yields(storage);
        farm.getCoops()[0].getChicken(2).yields(storage);
        farm.getCoops()[0].getChicken(3).yields(storage);
        farm.getCoops()[1].getChicken(0).yields(storage);
        farm.getCoops()[1].getChicken(1).yields(storage);
        farm.getCoops()[1].getChicken(2).yields(storage);
        farm.getCoops()[1].getChicken(3).yields(storage);
        froilan.mount(farm.getTractor());
        froilan.operate(farm.getTractor());
        farm.getTractor().ride();
        farm.getTractor().turnOn();
        farm.getTractor().harvest(farm.getField());
        farm.getTractor().dismountVehicle();

    }

    public void sunday() {
        everyday();
        froilan.operate(farm.getTractor());
        farm.getTractor().ride();
        farm.getTractor().makenoise();
        farm.getTractor().dismountVehicle();
    }
}





