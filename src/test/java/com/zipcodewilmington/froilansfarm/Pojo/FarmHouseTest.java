package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FarmHouseTest {
    private FarmHouse farmhouse;
    @Before
    public void before(){

        farmhouse = FarmHouse.getInstance();
        Storage a = Storage.getInstance();
        a.resetConainter();
    }

    @Test
    public void testConstructor(){
        ArrayList<Person> list = farmhouse.getList();

        for (int i = 0; i < list.size() ; i++) {
            Assert.assertTrue(list.get(i) instanceof Person);
        }
    }

    @Test
    public void testAdd(){
        //expected
        Integer expected = 3;

        //action
        farmhouse.addPerson(new Farmer());

        //assert
        Assert.assertEquals(expected, farmhouse.getCount());
    }

    @Test
    public void testGetPerson(){
        //expected
        Pilot newPilot = new Pilot();

        //action
        farmhouse.addPerson(newPilot);

        //assert
        Assert.assertEquals(newPilot, farmhouse.getPerson(newPilot));
    }

    ///// field tests
    @Test
    public void testAddRowField(){
        Field field = new Field();
        field.addRow(new CropRow());

        Assert.assertEquals(1, field.getCropRow().size());
    }


    @Test
    public void testFieldRemoveRow(){
        Field field = new Field();
        CropRow a = new CropRow();
        field.addRow(a);

        Assert.assertEquals(1, field.getCropRow().size());

        field.remove(a);

        Assert.assertEquals(0, field.getCropRow().size());
    }

    @Test
    public void testFieldFertilize(){
        Field field = new Field();
        field.addRow(new CropRow());
        field.addRow(new CropRow());
        field.addRow(new CropRow());



        for (int i = 0; i < field.getCropRow().size(); i++) {
            field.getCropRow().get(i).add(new CornStalk());
        }

        field.fertilize();

        for (int i = 0; i < field.getCropRow().size(); i++) {
            Assert.assertTrue(field.getCropRow().get(i).getFertilized());
        }

    }

    @Test
    public void testFieldHarvest(){
        Field field = new Field();
        field.addRow(new CropRow());
        field.addRow(new CropRow());
        field.addRow(new CropRow());



        for (int i = 0; i < field.getCropRow().size(); i++) {
            field.getCropRow().get(i).add(new CornStalk());
        }

        field.harvestField();

        Storage a = Storage.getInstance();

        Assert.assertEquals(Integer.valueOf(24), a.count(new CornStalk()));
    }


}
