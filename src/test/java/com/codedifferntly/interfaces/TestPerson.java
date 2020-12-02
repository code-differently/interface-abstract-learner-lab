package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //Given
        Person person  = new Person(007l,"Vic");

        //When
        long expected = 007l;
        long actual = person.getID();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void constructorNameTest(){
        //Given
        Person person = new Person(007l, "Vic");

        //When
        String expected = "Vic";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Person person = new Person(007l,"Vic");
        person.setName("Sam");

        //When
        String expected = "Sam";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }
}
