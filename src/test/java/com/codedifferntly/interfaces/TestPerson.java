package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
       //Give
        long id = 500;
        Person person = new Person(id);

        //When
        long expected = 500;
        long actual = person.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetName(){
        //Give
        Person person = new Person(500);
        person.setName("Celita");

        //When
        String expected = "Celita";
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
