package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void fly() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getIsFlying());

        dusty.fly();

        assertTrue(dusty.getIsFlying());

    }

    @Test
    public void makenoise() {
        CropDuster dusty = new CropDuster();
        String expected = "\nnnneeaoowww";

        assertEquals(expected, dusty.makenoise());
    }

    @Test
    public void engineNoise(){
        CropDuster dusty = new CropDuster();
        String expected = "\nnnneeaoowww";

        assertNotEquals(expected, dusty.engineNoise());
    }

    @Test
    public void ride() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getIsMoving());

        dusty.ride();

        assertTrue(dusty.getIsMoving());


    }

    @Test
    public void fertiilizes() {
    }


    @Test
    public void stopRiding() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getIsMoving());

        dusty.ride();

        assertTrue(dusty.getIsMoving());

        dusty.stopRiding();

        assertFalse(dusty.getIsMoving());
        }



    @Test
    public void getIsOn() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getIsOn());


    }
    @Test
    public void getIsOn2() {
        CropDuster dusty = new CropDuster();

        dusty.turnOn();

        assertTrue(dusty.getIsOn());


    }


    @Test
    public void setIsOn() {
        CropDuster dusty = new CropDuster();

        dusty.turnOn();

        assertTrue(dusty.getIsOn());

        dusty.turnOff();

        assertFalse(dusty.getIsOn());
    }



    @Test
    public void getHasPilot() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getHasRider());

        dusty.mountVehicle();

        assertTrue(dusty.getHasRider());

        dusty.dismountVehicle();

        assertFalse(dusty.getHasRider());

    }

    @Test
    public void setHasPilot() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getHasRider());

        dusty.mountVehicle();

        assertTrue(dusty.getHasRider());

        dusty.dismountVehicle();

        assertFalse(dusty.getHasRider());
    }

    @Test
    public void getMoving() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getIsMoving());

        dusty.ride();

        assertTrue(dusty.getIsMoving());

        dusty.stopRiding();

        assertFalse(dusty.getIsMoving());

    }

    @Test
    public void getPilot() {
        CropDuster dusty = new CropDuster();


        assertNull(dusty.getRider());

    }

    @Test
    public void getPilot2() {
        CropDuster dusty = new CropDuster();
        Pilot testPilot = new Pilot();

        dusty.addRider(testPilot);

        assertEquals(testPilot, dusty.getRider());

    }

    @Test
    public void setPilot() {
        CropDuster dusty = new CropDuster();
        Pilot testPilot = new Pilot();

        dusty.addRider(testPilot);

        assertEquals(testPilot, dusty.getRider());

        dusty.addRider(null);

        assertNull(dusty.getRider());

    }

    @Test
    public void landTest(){
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getIsFlying());

        dusty.fly();

        assertTrue(dusty.getIsFlying());

        dusty.land();

        assertFalse(dusty.getIsFlying());

    }
}