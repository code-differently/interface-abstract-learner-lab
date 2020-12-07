package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPeople {

    @Test
    public void testAdd() {
        //Given
        Person person = new Person(23);
        People people = new People();

        //When
        people.add(person);
        int expected = 1;
        int actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //Given
        Person person = new Person(23);
        People people = new People();
        people.add(person);

        //When
        people.remove(person.getId());
        int expected = 0;
        int actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindBy() {
        //Given
        Person person = new Person(23);
        People people = new People();
        people.add(person);

        //When
        Person actual = people.findById(person.getId());
        Person expected = person;

        //Then
        Assert.assertEquals(expected, actual);


    }

}