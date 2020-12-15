package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCornStalk {

    @Test
    public void CornStalkTest() {
        // Given
        ArrayList<Edible> earsOfCorn = new ArrayList<>();
        Edible corn = new Edible(earsOfCorn);
        boolean harvested = true;
        boolean fertilized = true;
        corn.yield(earsOfCorn, harvested, fertilized);
        earsOfCorn.add(corn);

        // When
        int expectedSize = 1;
        int actualSize = earsOfCorn.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
