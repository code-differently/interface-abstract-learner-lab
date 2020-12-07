package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void TestImplementation(){

        //Given
        Instructor instructor = new Instructor(9900, "Tariq");

        //When
        boolean actual = instructor instanceof Teacher;

        //Then
        Assert.assertTrue(true);

    }

    @Test
    public void TeatInheritance(){

        //Given
        Instructor instructor = new Instructor(9900, "Tariq");

        //When
        boolean actual = instructor instanceof Person;

        //Then
        Assert.assertTrue(true);

    }

    @Test
    public void TestTeach(){

        //Given
       Instructor instructor = new Instructor(9900, "Tariq");
       Student student = new Student(3325, "Danielle");
       instructor.teach(student,10);

       //When
       double expected = 15;
       double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);

    }

    @Test
    public void TestLecture(){

        //Given
        Instructor instructor = new Instructor(9900,"Tariq");
        Student Mike = new Student(1111,"Mike");
        Student Sam = new Student(1112,"Sam");
        Student Victor = new Student(1113, "Victor");
        Student Danielle = new Student(1114, "Danielle");

        Student[] students = {Mike, Sam, Victor, Danielle};

        //When

        double expected = 10;
        instructor.lecture(students, 20);

        // Then
        Assert.assertEquals("michael", expected, Mike.getTotalStudyTime(), 0.01);
        Assert.assertEquals("sam", expected, Sam.getTotalStudyTime(), 0.01);
        Assert.assertEquals("victor", expected, Victor.getTotalStudyTime(), 0.01);
        Assert.assertEquals("danielle", expected, Danielle.getTotalStudyTime(), 0.01);

    }
}
