package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TestEdible {

    @Test
    public void EdibleTest() {
        // Given
        ArrayList<Edible> cropl = new ArrayList<Edible>();
        boolean harvest = true;
        boolean fertilize = true;
        Edible edibleCrop = new Edible(cropl);

        // When
        String expectedString = "Successful Yield";
        String actualString = edibleCrop.yield(cropl, harvest, fertilize);

        // Then
        Assert.assertEquals(expectedString, actualString);
    }
}
