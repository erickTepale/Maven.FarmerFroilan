package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    Horse horse = new Horse();
    Storage<Tomato> tomatoStorage = new Storage<Tomato>();
    Farmer farmer = new Farmer();

    @org.junit.Test
    public void eat() {
        tomatoStorage.addFood(new Tomato());
        tomatoStorage.addFood(new Tomato());
        horse.eat(tomatoStorage);

        Integer expected = 1;
        Integer actual = tomatoStorage.count();

        Assert.assertEquals(expected,actual);
    }


    @org.junit.Test
    public void makenoise() {
        String actual = "Neigh";
        String expected = horse.makenoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void ride() {
        horse.ride();
        Boolean actual = true;
        Boolean expected = horse.getIsMoving();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void stopRiding() {
        horse.ride();
        horse.stopRiding();
        Boolean actual = false;
        Boolean expected = horse.getIsMoving();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIsMoving() {
        horse.ride();
        horse.stopRiding();
        Boolean actual = false;
        Boolean expected = horse.getIsMoving();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHasRiderFalse() {

        Boolean actual = false;
        Boolean expected = horse.getHasRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHasRiderTrue() {
        horse.setHasRider(true);
        Boolean actual = true;
        Boolean expected = horse.getHasRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setHasRider() {
        horse.setHasRider(true);

        assertTrue(horse.getHasRider());

    }

    @Test
    public void mountThis() {
            horse.mountThis(farmer);

            Rider actual = farmer;
            Rider expected = horse.getRider();

            Assert.assertEquals(expected,actual);
    }

    @Test
    public void getDriver() {
        horse.mountThis(farmer);

        Rider actual = farmer;
        Rider expected = horse.getRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getOffThis() {
        horse.mountThis(farmer);
        horse.getOffThis();
        Rider actual = null;
        Rider expected = horse.getRider();

        Assert.assertEquals(expected,actual);
    }
}