package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;


public class TestStudent {

    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(23);

        //Then
        Assert.assertThat(student, instanceOf(Learner.class));
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(23);

        //Then
        Assert.assertThat(student, instanceOf(Person.class));
    }

    @Test
    public void testLearn() {
        //Given
        Student student = new Student(23);

        //When
        student.learn(3.0);
        double expected = 3.0;
        double actual = student.getTotalStudyTime();

        //Then
        assertEquals(expected, actual);



    }
}