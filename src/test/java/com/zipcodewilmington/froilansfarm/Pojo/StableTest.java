package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StableTest {

    Stable stable = new Stable();
    @Test
    public void addHorseTest() {
        Horse chicken = new Horse();
        stable.addHorse(chicken);

        Horse actual = chicken;
        Horse expected = stable.getHorse(0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addHorseTest2() {
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());


        Integer actual = 2;
        Integer expected = stable.horesCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addHorseTest3() {
        Horse chicken = new Horse();
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        stable.addHorse(chicken);

        Horse actual = chicken;
        Horse expected = stable.getHorse(2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeHorseTest() {
        stable.addHorse(new Horse());
        stable.removeHorse(stable.getHorse(0));

        Integer actual = 0;
        Integer expected = stable.horesCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeHorseTestMultible() {
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());

        stable.removeHorse(stable.getHorse(0));

        Integer actual = 3;
        Integer expected = stable.horesCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void horesCount(){
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());

        Integer actual = 4;
        Integer expected = stable.horesCount();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void getHorseTest() {
        Horse chicken = new Horse();
        stable.addHorse(new Horse());
        stable.addHorse(new Horse());
        stable.addHorse(chicken);

        Horse actual = chicken;
        Horse expected = stable.getHorse(2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instance () {
        assertTrue(stable instanceof Stable);
    }
}