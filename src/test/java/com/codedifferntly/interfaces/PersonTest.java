package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void constructorIDTest() {
        //Given
        Person person = new Person(4251, "Mike");

        //When
        long expected = 425l;
        long actual =person.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorNameTest() {
        //Given
        Person person = new Person(425l, "Mike");

        //When
        String expected = "Mike";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest() {
        //Given
        Person person = new Person(425l, "Mike");
        person.setName("Sam");

        //When
        String expected = "Sam";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
