package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestChicken {

    @Test
    public void ChickenTest() {
        // Given
        String name = "Rooster";
        Chicken chicken1 = new Chicken(name);

        // When
        String expectedName = "Rooster";
        String actualName = chicken1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        String name = "Rooster";
        Chicken chicken1 = new Chicken(name);

        // When
        String expectedName = "Cluck Cluck";
        String newName = "Cluck Cluck";
        chicken1.setName(newName);
        String actualName = chicken1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
