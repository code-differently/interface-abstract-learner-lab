package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestAnimal {

    @Test
    public void AnimalTest() {
        // Given
        String name = "The GOAT";
        Animal animal1 = new Animal(name);

        // When
        String expectedName = "The GOAT";
        String actualName = animal1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        String name = "The GOAT";
        Animal animal1 = new Animal(name);

        // When
        String expectedName = "The BEAST";
        animal1.setName("The BEAST");
        String actualName = animal1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
