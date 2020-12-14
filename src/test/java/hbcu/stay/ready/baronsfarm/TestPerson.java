package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void PersonTest() {
        // Given
        String name = "Baron";
        Person person1 = new Person(name);

        // When
        String expectedName = "Baron";
        String actualName = person1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        // Given
        String name = "Baron";
        Person person1 = new Person(name);

        // When
        String expectedName = "Jamal";
        person1.setName("Jamal");
        String actualName = person1.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testNoiseMaker() {
        // Given
        String name = "Baron";
        Person person1 = new Person(name);

        // When
        String expectedNoise = "Make noise";
        String actualNoise = person1.makeNoise();

        // Then
        Assert.assertEquals(expectedNoise, actualNoise);

    }

    @Test
    public void testEater() {
        // Given
        String name = "Baron";
        Person person1 = new Person(name);

        // When
        String expectedNoise = "Chomp Chomp";
        String actualNoise = person1.eat();

        // Then
        Assert.assertEquals(expectedNoise, actualNoise);

    }
}
