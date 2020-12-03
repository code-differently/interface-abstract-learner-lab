package com.codedifferntly.interfaces;

//Create a TestPerson class.
//Create a testConstructor method which ensures that a Person object's id field
//      is being set upon construction.
//Create a testSetName method which ensures that a Person object's name variable
//      is being set by invoking the .setName method.

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //Given
        Person person = new Person(3);

       //When
        long expected = 3;
        long actual = person.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Given
        Person person = new Person(3);
        person.setName("Holly");

        //When
        String expected = "Holly";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
