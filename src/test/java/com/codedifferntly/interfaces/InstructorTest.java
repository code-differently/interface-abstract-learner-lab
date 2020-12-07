package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor(007, "Vic");

        //When
        boolean actual = instructor instanceof Teacher;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(007, "Vic");

        //When
        boolean actual =  instructor instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(007, "Vic");
        Student student = new Student(8, "Victor");
        instructor.teach(student, 10.0);

        //When
        double expected = 20.0;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor(007, "Victor");
        Student michael = new Student(1111, "Michael");
        Student sam = new Student(1112, "Sam");
        Student victor = new Student(1111, "Victor");
        Student danielle = new Student(1111, "Danielle");
        Student[] arrayofStudents = {michael, sam, victor, danielle};

        //When

        //Then
    }
}
