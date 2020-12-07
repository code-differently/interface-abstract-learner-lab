package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test

    public void constructorTest() {

        //Given
        long id = 123456789;
        Person personRef = new Person(id);

        //When
        long expected = 123456789;
        long actual = personRef.getId();

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test

    public void setNameTest() {

        //Given
        long id = 123456789;
        Person personRef = new Person(id);

        //When
        String expected = "Johnny";
        String actual = personRef.setName("Johnny");

        //Then
        Assert.assertEquals(expected,actual);


    }

}
