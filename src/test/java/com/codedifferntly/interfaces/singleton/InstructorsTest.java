package com.codedifferntly.interfaces.singleton;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void constructorTest(){

        //Given
        Instructors instructors = Instructors.getInstance();
        //When
        int expected = 8;
        int actual = instructors.getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
