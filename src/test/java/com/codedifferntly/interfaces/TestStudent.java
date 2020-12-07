package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //Given
        Long id = 5555L;

        //When
        Student student = new Student(id, "Demarcus");
        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Given
        Long id = 5555l;

        //When
        Student student = new Student(id, "Demarcus");

        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(5555L, "Demarcus");
        student.Learn(3);
        //When
        double expected = 9;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
}
