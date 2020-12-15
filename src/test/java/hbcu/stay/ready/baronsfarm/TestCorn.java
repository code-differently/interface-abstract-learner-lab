package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCorn {

    @Test
    public void CornTest() {
        // Given
        ArrayList<Edible> earsOfCorn = new ArrayList<>();
        boolean harvest = true;
        boolean fertilize = true;
        Edible corn = new Edible(earsOfCorn);

        // When
        String expectedString = "Successful Yield";
        String actualString = corn.yield(earsOfCorn, harvest, fertilize);

        // Then
        Assert.assertEquals(expectedString, actualString);
    }
}
