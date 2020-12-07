package com.codedifferntly.interfaces;

//Create a TestPerson class.
//        Create a testConstructor method which ensures that a Person object's id field is being set upon construction.
//        Create a testSetName method which ensures that a Person object's name variable is being set by invoking the .setName method.


import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorIDTest() {
        // Given
        Person person = new Person(425l, "Mike");

        // When
        long expected = 425l;
        long actual = person.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorNameTest() {
        // Given
        Person person = new Person(425l, "Mike");

        // When
        String expected = "Mike";
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given
        Person person = new Person(4251, "Mike");
        person.setName("Sam");

        // When
        String expected = "Sam";
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
