package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor(0000L, "Mr. Hook");
        //When
        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(0000l, "Mr. Hook");
        //When

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(0000L, "Mr. Hook");
        Student student = new Student(5555L, "Demarcus");
        //When
        double expected = 6;
        double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor(0000L, "Mr.Hook");
        Student Demarcus = new Student(5555L, "Demarcus");
        Student Stacy = new Student(6666L, "Stacy");
        Student Melvin = new Student(7777L, "Melvin");
        Learner[] students = new Learner[]{Demarcus, Stacy, Melvin};
        //When
        double expected = 7;
        instructor.lecture(students, 3);

        //Then
        Assert.assertEquals("Demarcus",expected, Demarcus.getTotalStudyTime(), 0.0);
        Assert.assertEquals("Stacy",expected, Stacy.getTotalStudyTime(), 0.0);
        Assert.assertEquals("Melvin",expected, Melvin.getTotalStudyTime(), 0.0);

    }
}
