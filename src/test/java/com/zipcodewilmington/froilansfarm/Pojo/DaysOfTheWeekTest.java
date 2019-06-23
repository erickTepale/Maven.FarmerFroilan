package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DaysOfTheWeekTest {
    Farm farm = Farm.getINSTANCE();
    Storage storage = Storage.getInstance();
    Farmer froilan = new Farmer();
    Pilot froilanda = new Pilot();
    DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
    @Test
    public void everyDayRideAllHorsed() {

        Farm farm = Farm.getINSTANCE();
        Storage storage = Storage.getInstance();
        Farmer froilan = new Farmer();
        Pilot froilanda = new Pilot();
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();

        Boolean actual1 = farm.getStables()[0].getHorse(0).isMoving;
        Boolean expeceted1 = false;

        Assert.assertEquals(expeceted1, actual1);

        froilan.rideAllHorses();

        Boolean actual = farm.getStables()[0].getHorse(0).isMoving;
        Boolean expeceted = true;

        Assert.assertEquals(expeceted, actual);
    }
    @Test
    public void everyDayFeedAllHorses() {
        storage.resetConainter();
        for (int i = 0; i <30 ; i++) {
            storage.addEdible(new EarOfCorn());
        }

        Integer actual = storage.count(new EarOfCorn());
        Integer expeceted = 30;

        Assert.assertEquals(expeceted,actual);

        froilan.feedAllHorses(new EarOfCorn() ,1);

        Integer actual1 = storage.count(new EarOfCorn());
        Integer expeceted1 = 20;

        Assert.assertEquals(expeceted1,actual1);

    }

    @Test
    public void everyDayFroilanEat() {
        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());
        }

        Integer actual = storage.count(new EarOfCorn());
        Integer expeceted = 100;

        Assert.assertEquals(expeceted,actual);

        froilan.eat(new EarOfCorn(), 1);
        froilan.eat(new Tomato() , 2);
        froilan.eat(new EdibleEgg(), 5);


        Integer actual1 = storage.count(new EarOfCorn());
        Integer expeceted1 = 99;

        Assert.assertEquals(expeceted1,actual1);

        Integer actual2 = storage.count(new Tomato());
        Integer expeceted2 = 98;

        Assert.assertEquals(expeceted2,actual2);

        Integer actual3 = storage.count(new EdibleEgg());
        Integer expeceted3 = 95;

        Assert.assertEquals(expeceted3,actual3);

    }
    @Test
    public void everyDayFroilanadaEat() {

        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());
        }

        Integer actual = storage.count(new EarOfCorn());
        Integer expeceted = 100;

        Assert.assertEquals(expeceted,actual);

        froilanda.eat(new EarOfCorn(), 2);
        froilanda.eat(new Tomato() , 1);
        froilanda.eat(new EdibleEgg(), 2);


        Integer actual1 = storage.count(new EarOfCorn());
        Integer expeceted1 = 98;

        Assert.assertEquals(expeceted1,actual1);

        Integer actual2 = storage.count(new Tomato());
        Integer expeceted2 = 99;

        Assert.assertEquals(expeceted2,actual2);

        Integer actual3 = storage.count(new EdibleEgg());
        Integer expeceted3 = 98;

        Assert.assertEquals(expeceted3,actual3);


    }


    @Test
    public void everydayTest(){
        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());
        }

        daysOfTheWeek.everyday();

        Integer actual = storage.count(new EarOfCorn());
        Integer expeceted = 87;

        Assert.assertEquals(expeceted,actual);

        Integer actual2 = storage.count(new Tomato());
        Integer expeceted2 = 97;

        Assert.assertEquals(expeceted2,actual2);

        Integer actual3 = storage.count(new EdibleEgg());
        Integer expeceted3 = 93;

        Assert.assertEquals(expeceted3,actual3);

    }

    @Test
    public void mondayCropRow0Test() {
        daysOfTheWeek.monday();

        Integer expected = 5;
        Integer actual = farm.getField().getCropRow().get(0).count();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mondayCropRow0FertTest() {
        daysOfTheWeek.monday();

        Boolean expected1 = false;
        Boolean actual1 = farm.getField().getCropRow().get(0).getFertilized();

        Assert.assertEquals(expected1, actual1);
    }


    @Test
    public void mondayCropRow1Test() {
        daysOfTheWeek.monday();

        Integer expected = 5;
        Integer actual = farm.getField().getCropRow().get(1).count();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void mondayCropRow1FertTest() {
        daysOfTheWeek.monday();

        Boolean expected1 = false;
        Boolean actual1 = farm.getField().getCropRow().get(1).getFertilized();

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void mondayCropRow2Test() {
        daysOfTheWeek.monday();

        Integer expected = 5;
        Integer actual = farm.getField().getCropRow().get(2).count();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void mondayCropRow2FertTest() {
        daysOfTheWeek.monday();

        Boolean expected1 = false;
        Boolean actual1 = farm.getField().getCropRow().get(2).getFertilized();

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void tuesdaCropRow0FertTesty() {
        daysOfTheWeek.tuesday();
        Boolean expected1 = true;
        Boolean actual1 = farm.getField().getCropRow().get(0).getFertilized();

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void tuesdaCropRow1FertTesty() {
        daysOfTheWeek.tuesday();
        Boolean expected1 = true;
        Boolean actual1 = farm.getField().getCropRow().get(1).getFertilized();

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void tuesdaCropRow2FertTesty() {
        daysOfTheWeek.tuesday();
        Boolean expected1 = true;
        Boolean actual1 = farm.getField().getCropRow().get(2).getFertilized();

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void wednesday() {
        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());
        }
        daysOfTheWeek.wednesday();
    }

    @Test
    public void thrusday() {
        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());
        }
        daysOfTheWeek.thrusday();
    }

    @Test
    public void friday() {
        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());
        }
        daysOfTheWeek.friday();
    }

    @Test
    public void saturday() {
        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());
        }
        daysOfTheWeek.saturday();
    }

    @Test
    public void sunday() {
        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());
        }
        daysOfTheWeek.sunday();
    }


    public void reset(){
        storage.resetConainter();
        farm.getField().remove(farm.getField().getCropRow().get(0));
        farm.getField().remove(farm.getField().getCropRow().get(1));
        farm.getField().remove(farm.getField().getCropRow().get(2));
        farm.getField().addRow(new CropRow());
        farm.getField().addRow(new CropRow());
        farm.getField().addRow(new CropRow());
        farm.getTractor().isOn =false;
        farm.getTractor().hasRider =false;
        farm.getTractor().rider = null;
        farm.getTractor().isMoving= false;
        farm.getCropDuster().isOn = false;
        farm.getCropDuster().hasRider = false;
        farm.getCropDuster().rider = null;
        farm.getCropDuster().isMoving = false;



    }
}

