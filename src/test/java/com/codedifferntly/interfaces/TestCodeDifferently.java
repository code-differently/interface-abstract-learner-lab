package com.codedifferntly.interfaces;
/*
Create a testHostLecture method which ensures that each of the Student's
 totalStudyTime instance variable is incremented by the specified numberOfHours
  upon invoking the hostLecture method.
 */
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestCodeDifferently {

    @Test
    public void testHostLecture(){
        CodeDifferently.hostLecture((Teacher) Instructors.getInstance().findById(543L),2.0);
        Student[] studentsArray = Students.getInstance().getArray();


        double expected = 2.0;
        double actual = studentsArray[1].getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);


    }
   @Test
    public void testHostLectureID() {
        CodeDifferently.hostLecture(543L, 2.0);
        Student[] studentsArray = Students.getInstance().getArray();

        double expected = 2.0;
        double actual = studentsArray[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);

   }

   @Test
    public void testEnum (){
        Educator tariq = Educator.TARIQ;

    }

   @After
    public void resetSingletonState(){
        Students.getInstance().personList.forEach(student ->  {
            student.totalStudyTime = 0;
        });
   }



}
