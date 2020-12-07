package com.codedifferntly.interfaces;

//import org.junit.Test;Create a TestInstructor class.
//Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
//Create a testInheritance method that asserts that an Instructor is an instanceof a Person.
//Create a testTeach method that ensures when an Instructor invokes the teach method,
    //a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
//Create a testLecture method that ensures when an Instructor invokes the lecture method,
    // a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        //Given
        Instructor instructor = new Instructor(37);

        //When
        boolean Instructor = instructor instanceof Teacher;

        //Then
        Assert.assertTrue(Instructor);

    }

    @Test
    public void testInheritance() {
        //Given
        Instructor instructor = new Instructor(37);

        //When
        boolean Instructor = instructor instanceof Person;

        //Then
        Assert.assertTrue(Instructor);
    }

    @Test
    public void testTeach() {
        //Given
        Student student = new Student(1);
        Instructor instructor = new Instructor(37);
        instructor.teach(student, 8.0);

        //When
        double expected = 8.0;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testLecture() {
        //Given
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Instructor instructor = new Instructor(37);
        Learner[] students = {student1, student2};

        //When
        instructor.lecture(students, 8.0);
        double expected = 8.0;
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual1, actual2);
    }
}