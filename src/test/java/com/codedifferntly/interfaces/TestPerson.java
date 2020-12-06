package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorIdTest() {

        //Given
        Person person = new Person(451l, "Mike");

        //When
        long expected = 451l;
        long actual = person.getId();

        //Than
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorNameTest(){
        //Given
        Person person = new Person(451l, "Mike");

        //When
        String expected = "Mike";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setNameTest(){
        //Given
        Person person = new Person(452l, "Sam");
        person.setName("Sam");

        //When
        String expected = "Sam";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected,actual);

    }
}
