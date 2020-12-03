package com.codedifferntly.interfaces;

//import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class InstructorTest {

    @Test
    public void TestInstructor() {
        Instructor instructor = new Instructor(123);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void TestInheritance() {
        Instructor instructor = new Instructor(123);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void TestTeach() {
        Instructor instructor = new Instructor(123);
        Student student = new Student(123);
        instructor.teach(student, 1.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 1.0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestLecture() {
        Student s1 = new Student(123);
        Student s2 = new Student(124);
        Instructor instructor = new Instructor(126);
        Double expected = 1.0;
        Learner[] learners = {s1, s2};
        instructor.lecture(learners, 1.0);
        Double actual = s2.getTotalStudyTime();
        Assert.assertEquals(expected, actual);

    }
}