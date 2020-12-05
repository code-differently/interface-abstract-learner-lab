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

    @Test
    public void testRemove() {
        // Given
        Student student = new Student(55840, "Timothy");
        Students.getInstance().add(student);

        // When
        // Get size instead of hardcoding number, because other tests are adding/removing items which changes results
        // of this test depending on if we test this method alone, or test all methods in the class at the same time.
        int expected = Students.getInstance().getCount() - 1;
        Students.getInstance().remove(student.getId());
        int actual =  Students.getInstance().getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

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

    //  Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.
    @Test
    public void testFindById() {
        // Given
        Student student = new Student(0075, "Jameson Bonde");
        Students.getInstance().add(student);

        // When
        Student expected = student;
        Student actual = Students.getInstance().findById(student.getId());

        // Then
        Assert.assertEquals(expected, actual);
    }
}
