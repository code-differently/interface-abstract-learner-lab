package com.codedifferntly.interfaces.singletons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructors {

    @Test
    public void testConstructor() {
        Instructors instructors = Instructors.getInstance();

        int expected = 7;
        int actual = instructors.getCount();

        Assert.assertEquals(expected, actual);
    }

}