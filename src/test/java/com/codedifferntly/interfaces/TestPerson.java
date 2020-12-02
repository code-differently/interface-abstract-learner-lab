package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
//    Create a TestPerson class.
//    Create a testConstructor method which ensures that a Person object's id field is
//          being set upon construction.
//    Create a testSetName method which ensures that a Person object's name variable is
//          being set by invoking the .setName method.

    @Test
    public void testConstructor() {
        //Given
        Person testperson = new Person(1L);

       //When
        long expected = 1L;
        long actual = testperson.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Given
        Person testperson = new Person(1L);
        testperson.setName("Holly");

        //When
        String expected = "Holly";
        String actual = testperson.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
