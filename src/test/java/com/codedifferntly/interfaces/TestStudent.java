package com.codedifferntly.interfaces;

//Create a TestStudent class.
//Create a testImplementation method that asserts that a Student is an instanceof a Learner.
//Create a testInheritance method that asserts that a Student is an instanceof a Person.
//Create a testLearn method that ensures a Student's totalStudyTime instance variable is
//incremented by the specified numberOfHours by invoking the .learn method.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {

//    @Before
//    public void setUp()   {  //throws Exception?
//        Student student = new Student(1);
//}

    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(1);

        //When
        boolean Student = student instanceof Learner;

        //Then
        Assert.assertTrue(Student);

    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(1);

        //When
        boolean Student = student instanceof Person;

        //Then
        Assert.assertTrue(Student);

    }

    @Test
    public void testLearn() {
        //Given
        Student Student = new Student(1);

        //When
        Student.learn(5.0);
        double expected = 5.0;
        double actual = Student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.00001);


    }


}

