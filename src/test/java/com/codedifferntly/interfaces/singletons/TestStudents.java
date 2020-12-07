package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.singletons.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents(){


        int expected = 8;
        Students students = Students.getInstance();
        int actual = students.getCount();

        Assert.assertEquals(expected, actual);


    }
}
