package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {

        // Given
        Student student = new Student(123);

        // When
        // Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {

        // Given
        Student student = new Student(123);

        // When
        // Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {

        // Given
        Student student = new Student(123);
        double expected = 1.0 ;

        // When
        student.learn(1.0);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 1.01);
    }
}
