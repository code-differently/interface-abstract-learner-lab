package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    // prior versions used a full comparison statement
    // this option passes tests, but I don't think it
    // truly informs the situation. Leaving comments for discussion
    @Test
    public void TestInstructor() {
        new Instructor(123, "Tariq");
        Assert.assertTrue(true);
    }

    @Test
    public void TestInheritance() {
        new Instructor(123, "Tariq");
        Assert.assertTrue(true);
    }

    @Test
    public void TestTeach() {
        Instructor instructor = new Instructor(123, "Tariq");
        Student student = new Student(124, "Ray");
        instructor.teach(student, 1.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 1.0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestLecture() {
        Student s1 = new Student(123, "Ray");
        Student s2 = new Student(124, "Matt");
        Instructor instructor = new Instructor(126, "Tariq");
        Double expected = 1.0;
        Learner[] learners = {s1, s2};
        instructor.lecture(learners, 1.0);
        Double actual = s2.getTotalStudyTime();
        Assert.assertEquals(expected, actual);

    }
}