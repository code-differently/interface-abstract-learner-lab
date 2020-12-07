package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class TestInstructor {

    @Test
    public void testImplementation() {
        //Given
        long id = 23L;

        //When
        Instructor instructor = new Instructor(id);

        //Then
        Assert.assertThat(instructor, instanceOf(Teacher.class));
    }

    @Test
    public void testInheritance() {
        //Given
        long id = 23L;

        //When
        Instructor instructor = new Instructor(id);

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor(1);
        Student student = new Student(23);

        //When
        instructor.teach(student, 3.0);
        double expected = 3.0;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor(1);
        Student celita = new Student(233);
        Student kojo = new Student(234);
        Student ashley = new Student(235);
        Learner[] learners = new Learner[]{celita, kojo, ashley};


        //When
        instructor.lecture(learners, 3.0);
        double expected = 1.0;
        double actual = kojo.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.0);

    }

}