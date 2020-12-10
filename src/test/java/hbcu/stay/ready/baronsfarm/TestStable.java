package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestStable {

    @Test
    public void StableTest() {
        // Given
        String newStable = "Stable #1";
        ArrayList<Horse> herdOfHorses = new ArrayList<>();
        Stable stable = new Stable(newStable, herdOfHorses);

        // When
        String expectedName = "Stable #2";
        String changeStable = "Stable #2";
        stable.setStableID(changeStable);
        String actualName = stable.getStableID();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void StableArrayListTest() {
        // Given
        String newStable = "Stable #1";
        String horseName = "Mr. Ed";
        Horse horse1 = new Horse(horseName);
        ArrayList<Horse> herdOfHorses = new ArrayList<>();
        Stable stable = new Stable(newStable, herdOfHorses);
        stable.addHorse(horse1);

        // When
        int expectedSize = 1;
        int actualSize = stable.getHorseList().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
