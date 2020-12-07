package com.codedifferntly.interfaces.singletons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudents {

    @Test
    public void testConstructor() {
        Students students = Students.getInstance();
        int expected = 5;
        int actual = students.getCount();

        Assert.assertEquals(expected, actual);
    }
}