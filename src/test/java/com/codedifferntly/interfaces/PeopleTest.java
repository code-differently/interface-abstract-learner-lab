package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {
    @Test
    public void testAdd() {
        // Given
        People people = new People();
        Person person = new Person(4536l, "Timothy");

        // When
        people.add(person);
        int expected = 1;
        int actual = people.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestRemove() {
        // Given
        People people = new People();
        Person person = new Person(4536l, "Timothy");
        people.add(person);

        // When
        people.remove(person.getID());
        int expected = 0;
        int actual =  people.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {
        // Given
        People people = new People();
        Person person = new Person(789123l, "Peter");
        people.add(person);

        // When
        Person expected = person;
        Person actual = people.findById(person.getID());

        // Then
        Assert.assertEquals(expected, actual);
    }
}
