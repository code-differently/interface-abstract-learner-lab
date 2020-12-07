package com.codedifferntly.interfaces.singletons;

//   Create a TestCodeDifferently class.
//        Create a testHostLecture method which ensures that each of the Student's totalStudyTime instance variable is incremented by the specified numberOfHours upon invoking the hostLecture method.

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.Person;
import com.codedifferntly.interfaces.Student;
import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestCodeDifferently {

    @Test
    public void testHostLecture() {
        // Given

        // When
        Teacher teacher = new Instructor(789, "Peter");
        CodeDifferently.getInstance().hostLecture(teacher, 81);

        double expected = 14;
        Student student = Students.getInstance().findById(995);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}