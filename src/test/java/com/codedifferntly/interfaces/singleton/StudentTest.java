package com.codedifferntly.interfaces.singleton;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void addedStudentsToCohort(){
     //Given

      //When
        int expected = 4;
        int actual = Students.getInstance().getCount();

      //Then
        Assert.assertEquals(expected, actual);
    }
}
