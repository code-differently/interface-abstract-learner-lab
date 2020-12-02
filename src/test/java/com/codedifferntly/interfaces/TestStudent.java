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
//        Student testStudent = new Student(1);
//}

    @Test
    public void testImplementation() {
        //Given
        Student testStudent = new Student(1);

        //When
        boolean isStudentInstanceOf = testStudent instanceof Learner;

        //Then
        Assert.assertTrue(isStudentInstanceOf);

    }

    @Test
    public void testInheritance() {
        //Given
        Student testStudent = new Student(1);

        //When
        boolean isPersonInstanceOf = testStudent instanceof Person;

        //Then
        Assert.assertTrue(isPersonInstanceOf);

    }

    @Test
    public void testLearn() {
        //Given
        Student testStudent = new Student(1);
        testStudent.learn(5.0);
        //When


        //Then



    }
}

