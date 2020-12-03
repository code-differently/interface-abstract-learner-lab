package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(007l, "Vic");

        //When
        boolean actual = student instanceof Learner;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(007l, "Vic");

        //When
        boolean actual = student instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testLearn() {
        //Given
        Student student = new Student(007l, "Vic");
        student.Learn(10.0);

        //When
        double expected = 20.0;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testLecture() {

        //Given
        Instructor instructor = new Instructor(001, "Vic Da Instructor");
        Student michael = new Student(007, "Michael");
        Student sam = new Student(1112, "Sam");
        Student victor = new Student(1113, "Victor");
        Student danielle = new Student(1114, "Danielle");

        Student[] students = {michael, sam, victor, danielle};

        // When
        double expected = 15.0;
        instructor.lecture(students, 20);

        // Then
        Assert.assertEquals(expected, students[2].getTotalStudyTime(), 0.01);

    }
}
