package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    Person person;
    Person person2;
    People people;

    @Test
    public void testAdd() {
        person = new Person(123, "Ray");
        people = new People();
        people.add(person);
        Person actual = people.personList.get(0);
        Assert.assertEquals(person, actual);
    }

    @Test
    public void testFindById() {
        person = new Person(1234576543, "Ray");
        person2 = new Person(1234576544, "Matt");
        people = new People();
        people.add(person);
        people.add(person2);
        Person actual = people.personList.get(1);
        Person expected = people.findById(1234576544);
        Assert.assertEquals(expected, actual);
    }
}




