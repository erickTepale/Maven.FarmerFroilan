package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import
        org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FarmTest {
    Farm farm = Farm.getINSTANCE();



    @Test
    public void getTractorTractor() {
        assertTrue(farm.getTractor() instanceof Tractor);
    }

    @Test
    public void getTractorVechicle() {
        assertTrue(farm.getTractor() instanceof Vehicle);
    }

    @Test
    public void getTractorisOn() {

        Boolean acutal = farm.getTractor().isOn;
        Boolean expected = false;

        Assert.assertEquals(expected, acutal);
    }

    @Test
    public void getTractorHasRider() {

        Boolean acutal = farm.getTractor().hasRider;
        Boolean expected = false;

        Assert.assertEquals(expected,acutal);
    }

    @Test
    public void getCropDuster() {
        assertTrue(farm.getCropDuster() instanceof CropDuster);
    }
    @Test
    public void getCropDusterVechicle() {
        assertTrue(farm.getCropDuster() instanceof Vehicle);
    }

    @Test
    public void getCropDuster2() {

        Boolean acutal = farm.getCropDuster().isOn;
        Boolean expected = false;

        Assert.assertEquals(expected, acutal);
    }

    @Test
    public void getCropDuster3() {

        Boolean acutal = farm.getCropDuster().hasRider;
        Boolean expected = false;

        Assert.assertEquals(expected,acutal);
    }

    @Test
    public void getField() {
        assertTrue(farm.getField() instanceof Field);
    }


    @Test
    public void getFieldSizeAfterAdd() {
        farm.getField().addRow(new CropRow());
        farm.getField().addRow(new CropRow());
        Integer acutal = farm.getField().getCropRow().size();
        Integer expected = 7;

        Assert.assertEquals(expected,acutal);
    }


    @Test
    public void getCoops() {
        assertTrue(farm.getCoops() instanceof ChickenCoop[]);
    }


    @Test
    public void getCoopChicken() {
        assertTrue(farm.getCoops()[0].getChicken(0) instanceof Chicken);
    }

    @Test
    public void getCoopChickenAnimal() {
        assertTrue(farm.getCoops()[0].getChicken(0) instanceof Animal);
    }

    @Test
    public void getCoopsSize() {
        Integer acutal = farm.getCoops().length;
        Integer expected = 4;

        Assert.assertEquals(expected,acutal);
    }


    @Test
    public void getStables() {
        assertTrue(farm.getStables() instanceof Stable[]);
    }

    @Test
    public void getStableHorse() {
        assertTrue(farm.getStables()[0].getHorse(0) instanceof Horse);
    }

    @Test
    public void getStableHorseAnimal() {
        assertTrue(farm.getStables()[0].getHorse(0) instanceof Animal);
    }

    @Test
    public void getStableSize() {
        Integer acutal = farm.getStables().length;
        Integer expected = 3;

        Assert.assertEquals(expected,acutal);
    }
}