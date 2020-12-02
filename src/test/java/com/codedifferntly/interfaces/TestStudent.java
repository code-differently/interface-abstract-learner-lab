package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        //Given
        Long id = 555L;

        //When
        Student student = new Student(id);

        //Then
        Assert.assertTrue(student instanceof Learner);

    }
    @Test
    public void testInheritance(){
        //Given
        Long id = 555L;

        //When
        Student student = new Student(id);

        //Then
        Assert.assertTrue(student instanceof Person);

    }
    @Test
    public void testLearn(){
        //Given
        Student student = new Student ( 555L);
        student.learn( 2.0);

        //When

        double expected = 2.0;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual,0.0);
    }
}
