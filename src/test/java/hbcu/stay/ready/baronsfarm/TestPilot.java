package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestPilot {

    @Test
    public void PilotTest() {
        // Given
        String name = "Air Force One";
        Pilot pilot1 = new Pilot(name);

        // When
        String expectedName = "Air Force One";
        String actualName = pilot1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        String name = "Air Force One";
        Pilot pilot1 = new Pilot(name);

        // When
        String expectedName = "Air Force Two";
        pilot1.setName("Air Force Two");
        String actualName = pilot1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testNoiseMaker() {
        // Given
        String name = "Air Force One";
        Pilot pilot1 = new Pilot(name);

        // When
        String expectedNoise = "Make noise";
        String actualNoise = pilot1.makeNoise();

        // Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void testEater() {
        // Given
        String name = "Air Force One";
        Pilot pilot1 = new Pilot(name);

        // When
        String expectedEater = "Chomp Chomp";
        String actualEater = pilot1.eat();

        // Then
        Assert.assertEquals(expectedEater, actualEater);
    }

    @Test
    public void testFly() {
        // Given
        String name = "Air Force One";
        Pilot pilot1 = new Pilot(name);

        // When
        String expectedFlight = "up up and away";
        String actualFlight = pilot1.fly();

        // Then
        Assert.assertEquals(expectedFlight, actualFlight);
    }

    @Test
    public void testFertilize() {
        // Given
        String name = "Air Force One";
        Pilot pilot1 = new Pilot(name);

        // When
        String expectedSoil = "fertilized";
        String actualSoil = pilot1.fertilize();

        // Then
        Assert.assertEquals(expectedSoil, actualSoil);
    }
}
