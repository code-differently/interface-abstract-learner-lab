package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestTomato {

    @Test
    public void TomatoTest() {
        // Given
        Crop tomato = new Crop();
        ArrayList<Crop> juicyTomatoes = new ArrayList<>();
        juicyTomatoes.add(tomato);

        // When
        int expectedSize = 1;
        int actualSize = juicyTomatoes.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
