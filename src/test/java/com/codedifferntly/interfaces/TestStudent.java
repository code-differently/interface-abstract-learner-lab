package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test

    public void testImplementation() {

        //Given
        Student student1 = new Student(123);

        //Then
        Assert.assertTrue(student1 instanceof Learner);
    }




    @Test

    public void testInheritance() {

        //Given
        Student student2 = new Student(456);

        //Then
        Assert.assertTrue(student2 instanceof Person);
    }


    @Test

    public void testLearn() {

        //Given
        Student student3 = new Student(789);

        //When
        student3.learn(25.0);
        Double expected = 25.0;
        Double actual = student3.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0.0);

    }
}
