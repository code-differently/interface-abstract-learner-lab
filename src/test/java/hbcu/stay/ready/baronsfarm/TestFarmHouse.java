package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestFarmHouse {

    @Test
    public void FarmHouseTest() {
        // Given
        String houseName = "Baron's Family Farmhouse";
        ArrayList<Person> familyAndFriends = new ArrayList<>();
        FarmHouse house = new FarmHouse(houseName, familyAndFriends);

        // When
        String expectedName = "Baron's Family Farmhouse";
        String actualName = house.getHouseName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void FarmHouseArrayListTest() {
        // Given
        String houseName = "Baron's Family Farmhouse";
        String name = "Beren";
        Person person1 = new Person(name);
        ArrayList<Person> familyAndFriends = new ArrayList<>();
        FarmHouse house = new FarmHouse(houseName, familyAndFriends);
        house.addPerson(person1);

        // When
        int expectedSize = 1;
        int actualSize = house.getPersonList().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }
}
