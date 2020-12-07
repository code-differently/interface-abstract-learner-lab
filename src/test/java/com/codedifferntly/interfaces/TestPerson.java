package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //Given
        Person person = new Person(23);

        //When
        long expected = 23;
        long actual = person.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Given
        Person person = new Person(23);
        person.setName("Jordan");

        //When
        String expected = "Jordan";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
