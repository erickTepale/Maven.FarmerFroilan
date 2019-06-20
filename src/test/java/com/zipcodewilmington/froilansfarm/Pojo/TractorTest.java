package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {

    @org.junit.Test
    public void makenoise() {
        Tractor johnDeere = new Tractor();

        String expected = "puhVRooPuhHoo puhVROOpuhHOO";

        assertEquals(expected, johnDeere.makenoise());
    }

    @org.junit.Test
    public void ride() {
        Tractor johnDeere = new Tractor();

        assertFalse(johnDeere.getIsMoving());

        johnDeere.ride();

        assertTrue(johnDeere.getIsMoving());
    }

    @org.junit.Test
    public void harvest() {
    }


    @Test
    public void getIsOn() {
        Tractor johnDeere = new Tractor();

        assertFalse(johnDeere.isOn);

    }

    @Test
    public void setIsOn() {

        Tractor johnDeere = new Tractor();

        assertFalse(johnDeere.getIsOn());

        johnDeere.setIsOn(true);

        assertTrue(johnDeere.getIsOn());
    }

    @Test
    public void getHasRider() {
        Tractor johnDeere = new Tractor();

        assertFalse(johnDeere.hasRider);
    }

    @Test
    public void getHasRider2(){
        Tractor johnDeere = new Tractor();

        assertFalse(johnDeere.hasRider);

        johnDeere.setHasRider(true);

        assertTrue(johnDeere.getHasRider());

    }

    @Test
    public void setHasRider() {

        Tractor johnDeere = new Tractor();


        johnDeere.setHasRider(true);

        assertTrue(johnDeere.getHasRider());
    }

    @Test
    public void stopRiding() {
        Tractor johnDeere = new Tractor();

        assertFalse(johnDeere.getIsMoving());

        johnDeere.ride();

        assertTrue(johnDeere.getIsMoving());

        johnDeere.stopRiding();

        assertFalse(johnDeere.getIsMoving());



    }

    @Test
    public void mountThis() {
        Tractor johnDeere = new Tractor();
        Rider thisRider = new Farmer();

        assertNull(johnDeere.getDriver());

        johnDeere.mountThis(thisRider);

        assertEquals(thisRider, johnDeere.getDriver());
    }

    @Test
    public void getDriver() {
        Tractor johnDeere = new Tractor();
        Rider thisRider = new Farmer();
        johnDeere.mountThis(thisRider);

        assertEquals(thisRider, johnDeere.getDriver());
    }

    @Test
    public void getOffThis() {
        Tractor johnDeere = new Tractor();
        Rider thisRider = new Farmer();
        johnDeere.mountThis(thisRider);

        assertEquals(thisRider, johnDeere.getDriver());

        johnDeere.getOffThis();

        assertNull(johnDeere.getDriver());

    }


}