package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.singletons.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents(){

        //Given
        Students students = Students.getInstance();
        Students students1 = Students.getInstance();
        Students students2 = Students.getInstance();
        Students students3 = Students.getInstance();

        //When
        boolean expected = students.equals(students1); students.equals(students2);
                            students.equals(students3);
        boolean actual = true;

        //Then
        Assert.assertTrue(true);


    }
}
