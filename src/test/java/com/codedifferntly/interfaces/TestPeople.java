package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        Person person = new Person("Ray", 123);
        People people = new People();
        people.add(person);
        Person actual = people.personList.get(0);
        Assert.assertEquals(person, actual);
    }
}




