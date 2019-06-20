package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {
    Tractor johnDeere = new Tractor();
    Tractor kubota = new Tractor();
    CropDuster dusty = new CropDuster();
    CropDuster rockwell = new CropDuster();


    @Test
    public void add() {
        Garage<Vehicle> testGarage = new Garage<Vehicle>();
        Integer expected = 1;
        Integer expected2 = 2;
        Integer expected3 = 3;
        Integer expected4 = 4;
        testGarage.add(johnDeere);

        assertEquals(expected, testGarage.sizeOfGarage());

        testGarage.add(kubota);

        assertEquals(expected2, testGarage.sizeOfGarage());

        testGarage.add(dusty);

        assertEquals(expected3, testGarage.sizeOfGarage());

        testGarage.add(rockwell);

        assertEquals(expected4, testGarage.sizeOfGarage());

    }

    @Test
    public void remove() {
        Garage<Vehicle> testGarage = new Garage<Vehicle>();
        testGarage.add(kubota);

        assertTrue(testGarage.remove(kubota));


    }

    @Test
    public void remove2(){
        Garage<Vehicle> testGarage = new Garage<Vehicle>();
        testGarage.add(kubota);

        assertFalse(testGarage.remove(dusty));

    }

    @Test
    public void sizeOfGarage() {
        Garage<Vehicle> testGarage = new Garage<Vehicle>();
        testGarage.add(kubota);
        testGarage.add(rockwell);
        Integer expected = 2;

        assertEquals(expected, testGarage.sizeOfGarage());
    }
}