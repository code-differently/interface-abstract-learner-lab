package com.codedifferntly.interfaces.singletons;

import org.junit.Assert;
import org.junit.Test;

//  Create a TestStudents class.
//  Create a test method which ensures that each of the students in your current cohort are in your Students singleton.

public class TestStudents {

    @Test
    public void constructorTest() {
        int expected = 9;
        Students students = Students.getInstance();         // Store static reference to singleton class local variable
        int actual = students.getCount();

        Assert.assertEquals(expected, actual);
    }
}
