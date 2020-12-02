package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;
import sun.jvm.hotspot.gc.shared.GCWhen;

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

        double expected = 0.0;
        boolean actual = false;

          double result = 0.0;
          for(s : students){

          }

        //Then


    }
}
