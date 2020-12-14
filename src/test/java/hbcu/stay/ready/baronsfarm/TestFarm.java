package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestFarm {

    @Test
    public void FarmTest1() {
        // Given
        String farmName = "Ol' McBarons";
        ArrayList<Crop> crop = new ArrayList<>();
        ArrayList<Person> farmFriends = new ArrayList<>();
        FarmHouse farmHouse = new FarmHouse(farmName, farmFriends);
        ArrayList<Stable> stable1 = new ArrayList<>();
        ArrayList<ChickenCoop> coop1 = new ArrayList<>();
        Farm farm1 = new Farm(farmHouse, stable1, coop1);

        // When
        ArrayList<Stable> expectedStable = stable1;
        ArrayList<Stable> actualStable = farm1.getStables();

        // Then
        Assert.assertEquals(expectedStable, actualStable);
    }

    @Test
    public void FarmTest2() {
        // Given
        String farmName = "Ol' McBarons";
        ArrayList<Person> farmFriends = new ArrayList<>();
        FarmHouse farmHouse = new FarmHouse(farmName, farmFriends);
        ArrayList<Stable> stable1 = new ArrayList<>();
        ArrayList<ChickenCoop> coop1 = new ArrayList<>();
        Farm farm1 = new Farm(farmHouse, stable1, coop1);

        // When
        ArrayList<ChickenCoop> expectedCoop = coop1;
        ArrayList<ChickenCoop> actualCoop = farm1.getChickenCoops();

        // Then
        Assert.assertEquals(expectedCoop, actualCoop);
    }

    @Test
    public void FarmTest3() {
        // Given
        String farmName = "Ol' McBarons";
        ArrayList<Person> farmFriends = new ArrayList<>();
        FarmHouse farmHouse = new FarmHouse(farmName, farmFriends);
        ArrayList<Stable> stable1 = new ArrayList<>();
        ArrayList<ChickenCoop> coop1 = new ArrayList<>();
        Farm farm1 = new Farm(farmHouse, stable1, coop1);

        // When
        FarmHouse expectedHouse = farmHouse;
        FarmHouse actualHouse = farm1.getFarmHouse();

        // Then
        Assert.assertEquals(expectedHouse, actualHouse);
    }

    @Test
    public void FarmTest4() {
        // Given
        String farmName = "Ol' McBarons";
        ArrayList<Person> farmFriends = new ArrayList<>();
        FarmHouse farmHouse = new FarmHouse(farmName, farmFriends);
        ArrayList<Stable> stable1 = new ArrayList<>();
        ArrayList<ChickenCoop> coop1 = new ArrayList<>();
        Farm farm1 = new Farm(farmHouse, stable1, coop1);
        ArrayList<Stable> stable2 = farm1.addStables();

        // When
        ArrayList<Stable> expectedStable = stable2;
        ArrayList<Stable> actualStable = farm1.getStables();

        // Then
        Assert.assertEquals(expectedStable, actualStable);
    }

    @Test
    public void FarmTest5() {
        // Given
        String farmName = "Ol' McBarons";
        ArrayList<Person> farmFriends = new ArrayList<>();
        FarmHouse farmHouse = new FarmHouse(farmName, farmFriends);
        ArrayList<Stable> stable1 = new ArrayList<>();
        ArrayList<ChickenCoop> coop1 = new ArrayList<>();
        Farm farm1 = new Farm(farmHouse, stable1, coop1);
        ArrayList<ChickenCoop> coop2 = farm1.addCoops();

        // When
        ArrayList<ChickenCoop> expectedCoop = coop2;
        ArrayList<ChickenCoop> actualCoop = farm1.getChickenCoops();

        // Then
        Assert.assertEquals(expectedCoop, actualCoop);
    }
}
