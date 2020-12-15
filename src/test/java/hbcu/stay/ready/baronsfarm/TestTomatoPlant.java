package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestTomatoPlant {

    @Test
    public void TomatoPlantTest() {
        // Given
        ArrayList<Edible> juicyTomatoes = new ArrayList<>();
        Edible tomato = new Edible(juicyTomatoes);
        boolean harvested = true;
        boolean fertilized = true;
        tomato.yield(juicyTomatoes, harvested, fertilized);
        juicyTomatoes.add(tomato);

        // When
        int expectedSize = 1;
        int actualSize = juicyTomatoes.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
