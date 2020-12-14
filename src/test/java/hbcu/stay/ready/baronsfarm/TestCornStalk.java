package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCornStalk {

    @Test
    public void CornStalkTest() {
        // Given
        ArrayList<Crop> earsOfCorn = new ArrayList<>();
        Crop corn = new Crop(earsOfCorn);
        boolean harvested = true;
        boolean fertilized = true;
        corn.yield(harvested, fertilized);
        earsOfCorn.add(corn);

        // When
        int expectedSize = 1;
        int actualSize = earsOfCorn.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
