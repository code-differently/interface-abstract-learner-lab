package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCorn {

    @Test
    public void CornTest() {
        // Given
        Crop corn = new Crop();
        ArrayList<Crop> earsOfCorn = new ArrayList<>();
        earsOfCorn.add(corn);

        // When
        int expectedSize = 1;
        int actualSize = earsOfCorn.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
