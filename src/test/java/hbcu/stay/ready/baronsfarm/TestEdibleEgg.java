package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestEdibleEgg {

    @Test
    public void EdibleEggTest() {
        // Given
        ArrayList<Edible> eggs = new ArrayList<Edible>();
        boolean harvest = true;
        boolean fertilize = true;
        EdibleEgg edibleEgg1 = new EdibleEgg(eggs);

        // When
        String expectedString = "Successful Yield";
        String actualString = edibleEgg1.yield(eggs, harvest, fertilize);


        // Then
        Assert.assertEquals(expectedString, actualString);
    }
}
