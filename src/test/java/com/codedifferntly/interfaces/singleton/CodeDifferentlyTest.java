package com.codedifferntly.interfaces.singleton;

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.Person;
import com.codedifferntly.interfaces.Student;
import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class CodeDifferentlyTest {
    @Test
    public void testHostLecture() {
        // Given

        // When
        Teacher teacher = new Instructor(789, "Peter");
        CodeDifferently.getInstance().hostLecture(teacher, 81);

        double expected = 14;
        Person student = Students.getInstance().findById(995);
        double actual = ((Student) student).getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
