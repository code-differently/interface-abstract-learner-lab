package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PeopleTest {

    @Test
    public void testAdd(){

        //Given
        Person person = new Person(456l, "");
        People people = new People();



        //When
        people.add(person);
        int expected = 1;
        int actual = people.getCount();

      //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){

        //Given
        Person person = new Person(456l, "");
        People people = new People();
        people.add(person);

        //When
        people.remove(person.getId());
        int expected = 0;
        int actual = people.getCount();

        //Then

    }

    @Test
    public void testFindById(){

        //Given
        Person person = new Person(456l, "");
        People people = new People();
        people.add(person);

        //When
        Person expected = person;
        Person actual = people.findById(person.getId());

        //Then
        Assert.assertEquals(expected, actual);

    }
}
