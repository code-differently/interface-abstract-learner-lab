package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        //Given
        Person person =  new Person(3333, null);
        People people = new People();

        //When
        people.add(person);
        double expected = 1;
        double actual = people.getCount();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testRemove(){
        //Given
        Person person = new Person(1111L, null);
        People people = new People();
        //When
        people.remove(person);
        double expected = 0;
        double actual = people.getCount();
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testFindById(){
        //Given
        Person person = new Person(1111L, null);
        People people = new People();
        people.add(person);

        //When
        Person expected = person;
        Person actual = people.findById(person.getId());

        //Then
        Assert.assertEquals(expected, actual);
    }
}
