package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //Given
        Long id = 234565L;
        Person person = new Person(id);

        //When
        Long expected = 234565L;
        Long actual = person.getId();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName(){
        //Given
        Person person = new Person(234L);

        //When
        String expected = "Sally";
        person.setName("Sally");

        //Then
        Assert.assertEquals(expected, person.getName());


    }
}
