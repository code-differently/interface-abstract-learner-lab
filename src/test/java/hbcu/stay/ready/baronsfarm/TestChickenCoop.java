package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestChickenCoop {

    @Test
    public void ChickenCoopTest() {
        // Given
        String newChickenCoop = "Coop #1";
        ArrayList<Chicken> herdOfChicken = new ArrayList<>();
        ChickenCoop chickenCoop = new ChickenCoop(newChickenCoop, herdOfChicken);

        // When
        String expectedName = "Coop #2";
        String changeChickenCoop = "Coop #2";
        chickenCoop.setChickenCoopID(changeChickenCoop);
        String actualName = chickenCoop.getChickenCoopID();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void ChickenCoopArrayListTest() {
        // Given
        String newChickenCoop = "Coop #1";
        String chickenName = "Buck Buck";
        Chicken chicken1 = new Chicken(chickenName);
        ArrayList<Chicken> herdOfChicken = new ArrayList<>();
        ChickenCoop chickenCoop = new ChickenCoop(newChickenCoop, herdOfChicken);
        chickenCoop.addChicken(chicken1);

        // When
        int expectedSize = 1;
        int actualSize = chickenCoop.getChickenList().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
