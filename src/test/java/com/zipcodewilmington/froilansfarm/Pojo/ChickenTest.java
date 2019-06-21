package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ChickenTest {
    Chicken chicken = new Chicken();
    Storage storage = Storage.getInstance();
    EdibleEgg edibleEgg = new EdibleEgg();


    @Before
        public void before() {
        storage.resetConainter();
    }
    @After
        public void after() {
//        storage.resetConainter();
    }

    @Test
    public void makenoise() {
        String actual = "cluck";
        String expected = chicken.makenoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void yields() {
        chicken.yields(storage);

        Integer actual = storage.count(edibleEgg);;
        Integer expected = 1;

        Assert.assertEquals(expected,actual);
    }
}