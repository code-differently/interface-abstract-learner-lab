package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestHorse {

    @Test
    public void HorseTest() {
        // Given
        String name = "Mr. Ed";
        Horse horse1 = new Horse(name);

        // When
        String expectedName = "Mr. Ed";
        String actualName = horse1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        String name = "Mr. Ed";
        Horse horse1 = new Horse(name);

        // When
        String expectedName = "Horseshoes";
        horse1.setName("Horseshoes");
        String actualName = horse1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
