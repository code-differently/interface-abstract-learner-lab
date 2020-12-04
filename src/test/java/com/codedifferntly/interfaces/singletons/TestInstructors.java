package com.codedifferntly.interfaces.singletons;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testConstructor() {
        Instructors instructors = Instructors.getInstance();
        int expected = 8;
        int actual = instructors.getCount();

        Assert.assertEquals(expected, actual);
    }
}
