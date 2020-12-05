package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testGetInstance(){
        Instructors instructors = Instructors.getInstance();

        int expectedCount = 3;
        int actualCount = instructors.getCount();

        Assert.assertEquals(expectedCount, actualCount);
    }
}
