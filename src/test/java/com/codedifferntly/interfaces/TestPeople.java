package com.codedifferntly.interfaces;

//   Part 6.0 - Test People
//        Create a TestPeople class.
//        Create a testAdd method which ensures that our personList in our People class populated with respective Person objects following invokation of the add method.
//        Create a testRemove method which ensures that the personList in a People object is depopulated with a respective Person object following the invokation of the remove method.
//        Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.

import com.codedifferntly.interfaces.singletons.Instructors;
import com.codedifferntly.interfaces.singletons.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

//    @Test
//    public void testAdd() {
//        // Given
//        People people = new People();
//        Person person = new Person(4536l, "Timothy");
//
//        // When
//        people.add(person);
//        int expected = 1;
//        int actual = people.getCount();
//
//        // Then
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testAdd() {
        // Given

        // When
        Instructors.getInstance().add(new Instructor(369, "Tariq"));
        int expected = 9;
        int actual = Instructors.getInstance().getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testRemove() {
//        // Given
//        People people = new People();
//        Person person = new Person(4536l, "Timothy");
//        people.add(person);
//
//        // When
//        people.remove(person.getId());
//        int expected = 0;
//        int actual =  people.getCount();
//
//        // Then
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testRemove() {
        // Given
        Student student = new Student(55840, "Timothy");
        Students.getInstance().add(student);

        // When
        Students.getInstance().remove(student.getId());
        int expected = 9;
        int actual =  Students.getInstance().getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }
//
//    @Test
//    public void testRemoveAll() {
//        // Given
//        People people = new People();
//        people.add(new Person(4536l, "Timothy"));
//        people.add(new Person(4536l, "Arnold"));
//
//        // When
//        people.removeAll();
//        int expected = 0;
//        int actual =  people.getCount();
//
//        // Then
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testRemoveAll() {
        // Given

        Instructors.getInstance().add(new Instructor(45361, "Timothy"));
        Instructors.getInstance().add(new Instructor(78204, "Arnold"));

        // When
        Instructors.getInstance().removeAll();
        int expected = 0;
        int actual =  Instructors.getInstance().getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }


//
//    // Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.
////    @Test
////    public void testFindById() {
////        // Given
////        People people = new People();
////        Person person = new Person(789123l, "Peter");
////        people.add(person);
////
////        // When
////        Person expected = person;
////        Person actual = people.findById(person.getId());
////
////        // Then
////        Assert.assertEquals(expected, actual);
////    }

    // Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.
    @Test
    public void testFindById() {
        // Given
        Student student = new Student(10756, "Jameson Bonde");
        Students.getInstance().add(student);

        // When
        Student expected = student;
        Student actual = Students.getInstance().findById(student.getId());

        // Then
        Assert.assertEquals(expected, actual);
    }
}
