package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    @Test
    public void mount() {
        Pilot pilot = new Pilot();
        Rideable rideable = new CropDuster();
        pilot.mount(rideable);
        Boolean actual = ((CropDuster) rideable).hasRider;
        Assert.assertTrue(actual);

    }

    @Test
    public void dismount() {
        Pilot pilot = new Pilot();
        Rideable rideable = new CropDuster();
        pilot.mount(rideable);
        Boolean actual = ((CropDuster) rideable).isFlying;
        Assert.assertFalse(actual);
    }

    @Test
    public void operate() {
        Pilot pilot = new Pilot();
        Rideable rideable = new CropDuster();
        pilot.operate(rideable);
        Boolean actual = ((CropDuster) rideable).isFlying;
        Assert.assertTrue(actual);
    }

    @Test
    public void fertilizeAllCropRows() {
        Pilot pilot = new Pilot();
        Farm farm = Farm.getINSTANCE();
        pilot.fertilizeAllCropRows(farm);

    }

    @Test
    public void makenoise() {
        Pilot pilot = new Pilot();
        String actual = pilot.makenoise();
        Assert.assertEquals("Pilot Shouting",actual);
    }
}