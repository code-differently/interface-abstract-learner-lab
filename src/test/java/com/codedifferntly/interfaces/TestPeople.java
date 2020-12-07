package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    @Test
    public void testAdd(){
        //Given
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
    /*
    @Test
    public <E> void testFindById(){
        //Given
        E person= new E(199L);
        ArrayList<E> personList = new ArrayList<>();
        long id = person.getId();

        person.setName("Molly");

        //When

        Person expected = person;
        Person actual = findById(id);

        // the above two work but I wanted to see if the name would work
       // String expected = "Molly";
      //  String actual = person.findById(id).getName();

        //Then
        Assert.assertEquals(expected, actual);

    }
    */
    @Test
    public void testRemoveAll(){
        //Given
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
