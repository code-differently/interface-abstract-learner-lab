package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test

    public void testImplementation() {
        //Given
        Instructor instructor1 = new Instructor(123);

        //Then
        Assert.assertTrue(instructor1 instanceof Teacher);
    }


    @Test

    public void testInheritance() {

        //Given
        Instructor instructor2 = new Instructor(456);

        //Then
        Assert.assertTrue(instructor2 instanceof Person);
    }


    @Test

    public void testTeach() {

        //Given
        Instructor instructor3 = new Instructor(789);
        Student stuRef = new Student(123);

        //When
        instructor3.teach(stuRef, 14.0);
        //stuRef.learn(14.0);
        double expected = 14.0;
        double actual = stuRef.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0.0);


    }
}
