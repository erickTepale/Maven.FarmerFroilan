package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropTest {
    CropRow row;

    @Before
    public void setUp(){
        row = new CropRow();
        row.add(new TomatoPlant());
        Storage.getInstance().resetConainter();
    }

    @Test
    public void testRowCount(){
        //expected
        Integer expected = 1;

        Assert.assertEquals(expected, row.count());
    }

    @Test
    public void testAdd(){
        //expected
        Integer expected = 2;

        //action
        row.add(new TomatoPlant());

        Assert.assertEquals(expected, row.count());

    }

    @Test
    public void testGetFertilized(){
        Assert.assertFalse(row.getFertilized());
    }

    @Test
    public void testSetFertilized(){
        row.fertilize();
        Assert.assertTrue(row.getFertilized());
    }

    @Test
    public void testCropRowHarvest(){
        Storage a = Storage.getInstance();
        row.harvest();

        Assert.assertEquals(Integer.valueOf(5), a.count(new Tomato()));
    }

    // Tomato Plant Tests
    @Test
    public void testHasBeenHarvestedTomato(){
        TomatoPlant tomatoPlant = new TomatoPlant();

        Assert.assertFalse(tomatoPlant.getHasBeenHavested());
    }

    @Test
    public void testIsFertilizedTomato(){
        TomatoPlant tomatoPlant = new TomatoPlant();

        Assert.assertFalse(tomatoPlant.getHasBeenFertilized());
    }

    @Test
    public void TestClearStalk(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.clearStalk();

        Assert.assertEquals(Integer.valueOf(0), tomatoPlant.count());
    }

    @Test
    public void testYields(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.yields(Storage.getInstance());

        Integer size = Storage.getInstance().count(new Tomato());

        Assert.assertEquals(Integer.valueOf(5), size);
    }

    // Test Cornstalksss
    @Test
    public void testHasBeenHarvestedCorn(){
        CornStalk cornstalk = new CornStalk();

        Assert.assertFalse(cornstalk.getHasBeenHavested());
    }

    @Test
    public void testIsFertilizedCorn(){
        CornStalk cornstalk = new CornStalk();

        Assert.assertFalse(cornstalk.getHasBeenFertilized());
    }

    @Test
    public void TestClearStalkCorn(){
        CornStalk cornstalk = new CornStalk();
        cornstalk.clearStalk();

        Assert.assertEquals(Integer.valueOf(0), cornstalk.count());
    }

    @Test
    public void testYieldsCorn(){
        CornStalk cornstalk = new CornStalk();
        cornstalk.yields(Storage.getInstance());

        Integer size = Storage.getInstance().count(new EarOfCorn());

        Assert.assertEquals(Integer.valueOf(8), size);
    }

    @Test
    public void testYieldsWatermelon(){
        WatermelonPlant cornstalk = new WatermelonPlant();
        cornstalk.yields(Storage.getInstance());

        Integer size = Storage.getInstance().count(new Watermelon());

        Assert.assertEquals(Integer.valueOf(1), size);
    }

    @Test
    public void testHasBeenHarvestedWatermelon(){
        WatermelonPlant cornstalk = new WatermelonPlant();

        Assert.assertFalse(cornstalk.getHasBeenHavested());
    }

    @Test
    public void testIsFertilizedWatermelon(){
        WatermelonPlant cornstalk = new WatermelonPlant();

        Assert.assertFalse(cornstalk.getHasBeenFertilized());
    }

    @Test
    public void TestClearStalkWatermelon(){
        WatermelonPlant cornstalk = new WatermelonPlant();
        cornstalk.clearStalk();

        Assert.assertEquals(Integer.valueOf(0), cornstalk.count());
    }
}