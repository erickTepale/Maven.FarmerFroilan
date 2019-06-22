package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import org.junit.Test;

public class DaysOfTheWeekTest {
    Farm farm = Farm.getINSTANCE();
    Storage storage = Storage.getInstance();
    Farmer froilan = new Farmer();
    Pilot froilanda = new Pilot();
    @Test
    public void everyDayRideAllHorsed() {

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
        Integer expeceted1 = 0;

        Assert.assertEquals(expeceted,actual);

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

        Assert.assertEquals(expeceted,actual);

        Integer actual2 = storage.count(new Tomato());
        Integer expeceted2 = 98;

        Assert.assertEquals(expeceted,actual);

        Integer actual3 = storage.count(new EdibleEgg());
        Integer expeceted3 = 95;

        Assert.assertEquals(expeceted,actual);

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

        Assert.assertEquals(expeceted,actual);

        Integer actual2 = storage.count(new Tomato());
        Integer expeceted2 = 99;

        Assert.assertEquals(expeceted,actual);

        Integer actual3 = storage.count(new EdibleEgg());
        Integer expeceted3 = 98;

        Assert.assertEquals(expeceted,actual);


    }


    @Test
    public void everydayTest(){
        storage.resetConainter();
        for (int i = 0; i <100 ; i++) {
            storage.addEdible(new EarOfCorn());
            storage.addEdible(new Tomato());
            storage.addEdible(new EdibleEgg());


        }

    }
}