package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        // Given
        Person person = new Person(123);
        long expected = 123;
        // When
        long actual = person.getId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person(123);
        person.setName("Bill Billiamson");
        String expected = "Bill Billiamson";

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
