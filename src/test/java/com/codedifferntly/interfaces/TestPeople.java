package com.codedifferntly.interfaces;

//   Part 6.0 - Test People
//        Create a TestPeople class.
//        Create a testAdd method which ensures that our personList in our People class populated with respective Person objects following invokation of the add method.
//        Create a testRemove method which ensures that the personList in a People object is depopulated with a respective Person object following the invokation of the remove method.
//        Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

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
        people.remove(person.getId());
        int expected = 0;
        int actual =  people.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
