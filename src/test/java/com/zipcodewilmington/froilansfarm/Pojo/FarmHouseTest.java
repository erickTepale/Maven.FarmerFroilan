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

}
