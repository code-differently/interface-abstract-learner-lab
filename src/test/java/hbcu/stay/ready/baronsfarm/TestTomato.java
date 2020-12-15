package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestTomato {

    @Test
    public void TomatoTest() {
        // Given
        ArrayList<Edible> juicyTomatoes = new ArrayList<>();
        boolean harvest = true;
        boolean fertilize = true;
        Edible tomato = new Edible(juicyTomatoes);

        // When
        String expectedString = "Successful Yield";
        String actualString = tomato.yield(juicyTomatoes, harvest, fertilize);

        // Then
        Assert.assertEquals(expectedString, actualString);
    }
}
