package com.codedifferntly.interfaces;
/*
Create a testHostLecture method which ensures that each of the Student's
 totalStudyTime instance variable is incremented by the specified numberOfHours
  upon invoking the hostLecture method.
 */
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestCodeDifferently {

    @Test
    public void testHostLecture(){
        CodeDifferently.hostLecture((Teacher) Instructors.getInstance().findById(560L),2.0);
        List<Object> studentsList = Arrays.asList(Students.getInstance().getArray());
        Student[] studentsArray = new Student[studentsList.size()];
        studentsList.toArray(studentsArray);

        double expected = 2.0;
        double actual = studentsArray[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);


    }
   @Test
    public void testHostLectureID() {
        CodeDifferently.hostLecture(560L, 2.0);
        List<Object> studentsList = Arrays.asList(Students.getInstance().getArray());
        Student[] studentsArray = new Student[studentsList.size()];
        studentsList.toArray(studentsArray);

       double expected = 2.0;
       double actual = studentsArray[0].getTotalStudyTime();

       Assert.assertEquals(expected, actual, 0.0);

   }



}
