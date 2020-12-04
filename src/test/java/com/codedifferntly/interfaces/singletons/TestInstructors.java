package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.People;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    private People instructors;

    @Test
    public void testInstructors(){


        int expected = 8;
        Instructors instructors = Instructors.getInstance();
        int actual = instructors.getCount();

        Assert.assertEquals(expected, actual);


    }
}
