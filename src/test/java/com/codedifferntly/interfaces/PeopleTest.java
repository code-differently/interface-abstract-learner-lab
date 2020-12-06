package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    private Student Student;

    @Test
    public void testAdd(){

        //Given
       // abstract People = new People();
        Person person = new Person(456l, "");

        People.personList.add(person);

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
        People people = new People();
        Person person = new Person(456l, "");
        people.add(person);


        //When
        people.remove(person.getId());
        int expected = 0;
        int actual = people.getCount();

        //Then
    Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testRemoveAll(){
//
//        //Given
//        People people = new People();
//        people.add(new Person(4112,"sam"));
//        people.add(new Person(4533,"sandu"));
//        //When
//        people.removeAll();
//        int expected = 0;
//        int actual = people.getCount();
//
//        //Then
//        Assert.assertEquals(expected,actual);
//    }
    @Test
    public void testFindById(){

        //Given

        People people = new People();
        Person person = new Person(456l, "");
        people.add(person);

        //When
        Person expected = person;
        Person actual = people.findById(person.getId());

        //Then
        Assert.assertEquals(expected, actual);

    }
}
