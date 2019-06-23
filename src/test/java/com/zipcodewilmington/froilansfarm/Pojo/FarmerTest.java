package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FarmerTest {



    @Test
    public void plantTest() {
        Farmer farmer = new Farmer();
      Crop crop = new TomatoPlant();
      CropRow cropRow = new CropRow();
        farmer.plant(crop,cropRow);
        Integer actual = cropRow.count();
        Assert.assertEquals(1,actual.intValue());


    }

    @Test
    public void mountTest() {
        Farmer farmer = new Farmer();
        Rideable rideable = new Tractor();
        farmer.mount(rideable);
        Boolean actual = ((Tractor) rideable).hasRider;
        Assert.assertTrue(actual);
    }

    @Test
    public void dismountTest() {
        Farmer farmer = new Farmer();
        Rideable rideable = new Tractor();
        farmer.dismount(rideable);
        Boolean actual = ((Tractor) rideable).hasRider;
        Assert.assertFalse(actual);
    }

    @Test
    public void operateTest() {
        Farmer farmer = new Farmer();
       Rideable rideable = new Tractor();
        farmer.operate(rideable);
        Boolean actual = ((Tractor) rideable).isMoving;
        Assert.assertTrue(actual);
    }

    @Test
    public void rideAllHorsesTest() {
        Farmer farmer = new Farmer();
        farmer.rideAllHorses();

    }

    @Test
    public void harvestAllCropRowsTest() {
        Farmer farmer = new Farmer();
        farmer.harvestAllCropRows();

    }

    @Test
    public void makenoiseTest() {
        Farmer farmer = new Farmer();
        String actual = farmer.makenoise();

        Assert.assertEquals("Farmer shouting!!",actual);
    }

    @Test
    public void eatTest() {
        Farmer farmer = new Farmer();
        Edible food = new Tomato();
        farmer.eat(food, 1);
        Assert.assertEquals(1,farmer.getStomach().size());
    }
}