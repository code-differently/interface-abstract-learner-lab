package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Student;
import org.junit.Assert;
import org.junit.Test;

//  Create a TestStudents class.
//  Create a test method which ensures that each of the students in your current cohort are in your Students singleton.

public class TestStudents {

    @Test
    public void constructorTest() {
        // Given
        Students students = Students.getInstance();

        // When
        int expected = 9;
        int actual = students.getCount();

        // Then
        // Note! Race conditions. Test will fail if tested with all other tests. But will pass on its own.
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetArrayOfStudents() {
        // Given
        Students.getInstance().add(new Student(300009, "Isaya"));

        // When
        Student[] actual = Students.getInstance().getArray();

        // Then
        Assert.assertTrue(actual.length > 0);
    }
}
