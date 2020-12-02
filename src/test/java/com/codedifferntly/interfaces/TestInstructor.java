package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

//    5.0
//    Create a TestInstructor class.
//    Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
//    Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
//    Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
//    Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.

public class TestInstructor {

    @Test
    public void TestImplementation() {
        // Given
        Instructor instructor = new Instructor(960, "Danielle");

        // When
        boolean actual = instructor instanceof Teacher;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance() {
        // Given
        Instructor instructor = new Instructor(960, "Danielle");

        // When
        boolean actual = instructor instanceof Person;

        // Then
        Assert.assertTrue(actual);
    }

//  Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
    @Test
    public void testTeach() {
        // Given
        Instructor instructor = new Instructor(960, "Danielle");
        Student student = new Student(3325, "Tariq");
        instructor.teach(student, 10);

        // When
        double expected = 15;
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }

//    Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
    @Test
    public void testLecture() {
        // Given
        Instructor instructor = new Instructor(960, "Tariq");
        Student michael = new Student(1111, "Michael");
        Student sam = new Student(1112, "Sam");
        Student victor = new Student(1113, "Victor");
        Student danielle = new Student(1114, "Danielle");
        Student[] students = {michael, sam, victor, danielle};

        // When
        double expected = 10;
        instructor.lecture(students, 20);

        // Then
        Assert.assertEquals("michael", expected, michael.getTotalStudyTime(), 0.01);
        Assert.assertEquals("sam", expected, sam.getTotalStudyTime(), 0.01);
        Assert.assertEquals("victor", expected, victor.getTotalStudyTime(), 0.01);
        Assert.assertEquals("danielle", expected, danielle.getTotalStudyTime(), 0.01);
    }

}
