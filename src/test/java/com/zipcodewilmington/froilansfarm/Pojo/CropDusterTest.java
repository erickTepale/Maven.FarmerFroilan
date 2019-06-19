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
        String expected = "nnneeaoowww";

        assertEquals(expected, dusty.makenoise());
    }

    @Test
    public void ride() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getMoving());

        dusty.ride();

        assertTrue(dusty.getMoving());


    }

    @Test
    public void fertiilizes() {
    }


    @Test
    public void stopRiding() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getMoving());

        dusty.ride();

        assertTrue(dusty.getMoving());

        dusty.stopRiding();

        assertFalse(dusty.getMoving());
        }



    @Test
    public void getIsOn() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getIsOn());


    }
    @Test
    public void getIsOn2() {
        CropDuster dusty = new CropDuster();

        dusty.setIsOn(true);

        assertTrue(dusty.getIsOn());


    }


    @Test
    public void setIsOn() {
        CropDuster dusty = new CropDuster();

        dusty.setIsOn(true);

        assertTrue(dusty.getIsOn());

        dusty.setIsOn(false);

        assertFalse(dusty.getIsOn());
    }



    @Test
    public void getHasPilot() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getHasPilot());

        dusty.setHasPilot(true);

        assertTrue(dusty.getHasPilot());

        dusty.setHasPilot(false);

        assertFalse(dusty.getHasPilot());

    }

    @Test
    public void setHasPilot() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getHasPilot());

        dusty.setHasPilot(true);

        assertTrue(dusty.getHasPilot());

        dusty.setHasPilot(false);

        assertFalse(dusty.getHasPilot());
    }

    @Test
    public void getMoving() {
        CropDuster dusty = new CropDuster();

        assertFalse(dusty.getMoving());

        dusty.ride();

        assertTrue(dusty.getMoving());

        dusty.stopRiding();

        assertFalse(dusty.getMoving());

    }

    @Test
    public void getPilot() {
        CropDuster dusty = new CropDuster();
        Pilot testPilot = new Pilot();

        assertNull(dusty.getPilot());

    }

    @Test
    public void getPilot2() {
        CropDuster dusty = new CropDuster();
        Pilot testPilot = new Pilot();

        dusty.setPilot(testPilot);

        assertEquals(testPilot, dusty.getPilot());

    }

    @Test
    public void setPilot() {
        CropDuster dusty = new CropDuster();
        Pilot testPilot = new Pilot();

        dusty.setPilot(testPilot);

        assertEquals(testPilot, dusty.getPilot());

        dusty.setPilot(null);

        assertNull(dusty.getPilot());

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