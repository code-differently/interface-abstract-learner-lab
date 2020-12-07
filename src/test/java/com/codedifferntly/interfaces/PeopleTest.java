package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    private Student Student;

    @Test
    public void testAdd(){

        //Given
        // Eventhough, it is a poor design in this case the only we can instantiate the
        // abstract class and make the test pass is ny instantiating anonymous inner subclass. This worked.
        People people = new People() {
            @Override
            public Person[] getArray() {
                return new Person[0];
            }
        };
        Person person = new Person(456l, "");

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
        People people = new People() {
            @Override
            public Person[] getArray() {
                return new Person[0];
            }
        };
        Person person = new Person(456l, "");
        people.add(person);


        //When
        people.remove(person.getId());
        int expected = 0;
        int actual = people.getCount();

        //Then
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById(){

        //Given

         People people = new People() {
            @Override
            public Person[] getArray() {
                return new Person[0];
            }
        };
        Person person = new Person(456l, "");
        people.add(person);

        //When
        Person expected = person;
        Person actual = people.findById(person.getId());

        //Then
        Assert.assertEquals(expected, actual);

    }
}
