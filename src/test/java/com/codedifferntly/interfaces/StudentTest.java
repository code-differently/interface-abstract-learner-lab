package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.singletons.Students;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

//    Create a TestStudent class.
//    Create a testImplementation method that asserts that a Student is an instanceof a Learner.
//    Create a testInheritance method that asserts that a Student is an instanceof a Person.
//    Create a testLearn method that ensures a Student's totalStudyTime instance variable is incremented by the specified numberOfHours by invoking the .learn method.

    @Test
    public void testImplementation() {
        // Given
        Student student = new Student(4256, "Victor");

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testInheritance() {
        // Given
        Student student = new Student(4256, "Victor");

        // When
        boolean actual = student instanceof Person;

        // Then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testLearn() {
        // Given
        Student student = new Student(7896, "Victor");
        student.Learn(10);

        // When
        double expected = 15;
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
