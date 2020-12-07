package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testGetInstance(){
      Students students = Students.getInstance();

      int expectedCount = 5;
      int actualCount = students.getCount();

      Assert.assertEquals(expectedCount, actualCount);

    }
}
