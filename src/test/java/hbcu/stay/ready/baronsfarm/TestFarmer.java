package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestFarmer {

    @Test
    public void FarmerTest() {
        // Given
        String name = "Farmer Joe";
        Farmer farmer1 = new Farmer(name);

        // When
        String expectedName = "Farmer Joe";
        String actualName = farmer1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        String name = "Farmer Joe";
        Farmer farmer1 = new Farmer(name);

        // When
        String expectedName = "Farmer Bob";
        farmer1.setName("Farmer Bob");
        String actualName = farmer1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testNoiseMaker() {
        // Given
        String name = "Baron";
        Farmer farmer1 = new Farmer(name);

        // When
        String expectedNoise = "Make noise";
        String actualNoise = farmer1.makeNoise();

        // Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void testEater() {
        // Given
        String name = "Baron";
        Farmer farmer1 = new Farmer(name);

        // When
        String expectedNoise = "Chomp Chomp";
        String actualNoise = farmer1.eat();

        // Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void testRider() {
        // Given
        String name = "Baron";
        Farmer farmer1 = new Farmer(name);

        // When
        String expectedRide = "vroom vroom";
        String actualRide = farmer1.vroom();

        // Then
        Assert.assertEquals(expectedRide, actualRide);
    }
}
