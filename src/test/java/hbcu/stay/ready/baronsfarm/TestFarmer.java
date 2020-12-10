package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestFarmer {

    @Test
    public void PersonTest() {
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
}
