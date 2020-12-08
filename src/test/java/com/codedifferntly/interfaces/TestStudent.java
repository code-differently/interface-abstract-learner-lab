package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.instanceOf;


public class TestStudent {
    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(500);

        //When


        //Then
        Assert.assertThat(student, instanceOf(Learner.class));
    }

    @Test
    public void testInheritance(){
        //Give
        Student student = new Student(500);


        //When


        //Then
        Assert.assertThat(student, instanceOf(Person.class));
    }

    @Test
    public void testLearn(){
        //Give
        Student student = new Student(500);


        //When
        student.learn(5.0);

        //Then
        assertEquals(5.0, student.getTestStudyTime());
    }

}
