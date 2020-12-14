package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestTomatoPlant {

    @Test
    public void TomatoPlantTest() {
        // Given
        ArrayList<Crop> juicyTomatoes = new ArrayList<>();
        Crop tomato = new Crop(juicyTomatoes);
        boolean harvested = true;
        boolean fertilized = true;
        tomato.yield(harvested, fertilized);
        juicyTomatoes.add(tomato);

        // When
        int expectedSize = 1;
        int actualSize = juicyTomatoes.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
