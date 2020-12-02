package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){

        //Given
        Student student = new Student(4256, "Victor");

        //When
        boolean actual = student instanceof Learner;

        //Then
        Assert.assertTrue(true);
    }

    @Test
    public void testInheritance(){

        //given
        Student student = new Student(4256,"Victor");

        //When
        boolean actual = student instanceof Person;

        //Then
        Assert.assertTrue(true);
    }

    @Test
    public void testLearn(){

        //Given
        Student student = new Student(4256, "Victor");
        student.Learn(10);
        //When
        double expected = 15;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0.01);

    }
}
