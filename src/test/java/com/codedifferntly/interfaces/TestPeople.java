package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    @Test
    public void testAdd(){
        //Given
        People people = new People();
        Person person1= new Person(199L);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);

        int expected =1;
        int actual = personList.size();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        //Given
        People people = new People();
        Person person1= new Person(199L);
        Person person2 = new Person( 198L);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        //When
        personList.remove(person1);
        int expected = 1;
        int actual = personList.size();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        //Given
        People people = new People();
        Person person1= new Person(199L);
        ArrayList<Person> personList = new ArrayList<>();
        people.add(person1);
        long id = person1.getId();

        person1.setName("Molly");

        //When

        //Person expected = person1;
        //Person actual = people.findById(id);

        // the above two work but I wanted to see if the name would work
        String expected = "Molly";
        String actual = people.findById(id).getName();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemoveAll(){
        //Given
        People people = new People();
        Person person1= new Person(199L);
        Person person2 = new Person( 198L);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        //When
        personList.clear();
        int expected = 0;
        int actual = personList.size();

        Assert.assertEquals(expected, actual);
    }
}
