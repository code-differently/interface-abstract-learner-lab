package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.Student;
import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestCodeDifferently {


    private Object student;

    @Test
    public void testHostLecture(){

        //Given


        Teacher teacher = new Instructor(767,"Tariq");
        CodeDifferently.getInstance().hostLecture(teacher,40);
        //When
        double expected = 40.0;
        student= Students.getInstance().findById(410L);
        double actual = ((Student) student).getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual,0.01);
    }
    @Test
    public void testHostLecture2(){
        //Given

        CodeDifferently.getInstance().hostLecture(441,40);

        //When
        double  numberOfHours = 40.0;
        student = Students.getInstance().findById(410l);
        double actual = ((Student) student).getTotalStudyTime();
        //Then
        Assert.assertEquals(numberOfHours,actual, 0.01);

    }

}
