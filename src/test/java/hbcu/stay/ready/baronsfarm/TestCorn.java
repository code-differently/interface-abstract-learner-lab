package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCorn {

    @Test
    public void CornTest() {
        // Given
        ArrayList<Crop> earsOfCorn = new ArrayList<>();
        Crop corn = new Crop(earsOfCorn);
        earsOfCorn.add(corn);

        // When
        int expectedSize = 1;
        int actualSize = earsOfCorn.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
