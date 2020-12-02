package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(007l,"Vic");

        //When
        boolean actual = student instanceof Learner;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(007l,"Vic");

        //When
        boolean actual = student instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testLearn(){
        //Given
        Student student = new Student(007l,"Vic");
        student.Learn(10.0);

        //When
        double expected = 20.0;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
