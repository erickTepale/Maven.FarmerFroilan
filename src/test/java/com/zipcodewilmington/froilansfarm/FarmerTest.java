package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Pojo.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FarmerTest {

    @Test
    public void plantMultipleCropTest() {
        // Given I have a farmer and a crop
        Farmer farmer = new Farmer();
        Crop crop = new TomatoPlant();
        Crop crop1 = new CornStalk();


        // Farmer plants crop
        /*farmer.plant(crop);
        farmer.plant(crop1);


        // Then I should find the crops in one of the croprows
        List<CropRow> cropRows = farmer.getFarm().getField().getCropRows();
        boolean isCropFound = false;
        boolean isCrop1Found = false;
        boolean isCrop2Found = false;
        for(CropRow cropRow : cropRows) {
            // Get Crops
            List<Crop> crops = cropRow.getCrops();
            if (crops.contains(crop)) {
                isCropFound = true;
            }
            else if(crops.contains(crop1)) {
                isCrop1Found = true;
            }
            else if(crops.contains(crop2)) {
                isCrop2Found = true;
            }
        }

        Assert.assertTrue(isCropFound);
        Assert.assertTrue(isCrop1Found);
        Assert.assertTrue(isCrop2Found);

    }
    @Test
    public void plantSingleCropTest() {
        //Given
        Farmer farmer = new Farmer();
        Crop crop = new TomatoPlant();
        farmer.plant(crop);
        List<CropRow> cropRows = farmer.getFarm().getField().getCropRows();
        boolean isSingleCrop = false;
        for(CropRow cropRow : cropRows) {
            List<Crop> crops = cropRow.getCrops();
            if(crops.contains(crop)) {
                isSingleCrop = true;
            }
        }

    Assert.assertTrue(isSingleCrop);
    }

    @Test
    public void mountTest() {
        Farmer farmer = new Farmer();



    }*/

    }
}
