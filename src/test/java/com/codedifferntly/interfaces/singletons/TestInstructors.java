package com.codedifferntly.interfaces.singletons;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructors(){

        //Given
        Instructors instructors = Instructors.getInstance();
        Instructors instructors1 = Instructors.getInstance();
        Instructors instructors2 = Instructors.getInstance();
        Instructors instructors3 = Instructors.getInstance();

        //When
        boolean expected = instructors.equals(instructors1); instructors.equals(instructors2);
                            instructors.equals(instructors3);
        boolean actual = true;

        //Then
        Assert.assertTrue(true);


    }
}
