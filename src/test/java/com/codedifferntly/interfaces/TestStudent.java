package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

<<<<<<< HEAD
public class TestStudent {

    @Test
    public void testImplementation() {

        // Given
        Student student = new Student(123);

=======
public class TestStudent  {

    @Test
    public void testImplementation() {
        // Given
        Student student = new Student(123);
>>>>>>> origin/ray
        // When
        // Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
<<<<<<< HEAD

        // Given
        Student student = new Student(123);

=======
        // Given
        Student student = new Student(123);
>>>>>>> origin/ray
        // When
        // Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
<<<<<<< HEAD

        // Given
        Student student = new Student(123);
        double expected = 1.0 ;

        // When
        student.learn(1.0);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 1.01);
=======
       // Given
       Student student = new Student(123);
       double expected = 1.0;
       student.learn(1.0);
       double actual = student.getTotalStudyTime();
       System.out.println(actual);
       Assert.assertEquals(expected, actual, 1.01);
>>>>>>> origin/ray
    }
}
