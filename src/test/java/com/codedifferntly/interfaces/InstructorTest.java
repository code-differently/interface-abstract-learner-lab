package com.codedifferntly.interfaces;

import interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

    public class InstructorTest {

    @Test
    public void TestImplementation() {
        //Given
        Instructor instructor = new Instructor(960, "Danielle");

        //When
        boolean actual = instructor instanceof Teacher;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
     public void testInheritance() {
        //Given
        Instructor instructor = new Instructor(960, "Danielle");

        //When
        boolean actual = instructor instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
        public void testTeach() {
        //Given
        Instructor instructor = new Instructor(960, "Danielle");
        Student student = new Student (3325, "Tariq");
        instructor.teach(student,10);

        //When
        double expected = 15;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
        public void testLecture() {
        //Given
        Instructor instructor = new Instructor(960, "Tariq");
        Student michael = new Student (1111, "Michael");
        Student sam = new Student(1112, "Sam");
        Student victor = new Student(1113, "Victor");
        Student danielle = new Student (1114, "Danielle");
        Student[] students = {michael, sam, victor, danielle};

        instructor.lecture(students, 20);

        //When
        double expected = 10;
        double actual = michael.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    }
