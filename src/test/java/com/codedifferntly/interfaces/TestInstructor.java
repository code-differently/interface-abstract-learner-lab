package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        //Given
        Long id = 234L;

        //When
        Instructor instructor = new Instructor(id);

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        Long id = 234L;

        //When
        Instructor instructor = new Instructor(id);

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor(234L);
        Student student = new Student(555L);

        //When
        instructor.teach(student, 4.0);
        double expected = 4.0;
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLectureEffectOnStudents(){
    //Given
    Instructor instructor = new Instructor(234L);
    Student holly = new Student(225L);
    Student matt = new Student(226L);
    Student ray = new Student(227L);
    Learner[] learners = new Learner[]{holly, matt, ray};


    //When
    instructor.lecture(learners, 1.0);
    double expected = 1.0;
    double actual = holly.getTotalStudyTime();

    //Then
        Assert.assertEquals(expected,actual,0.0);
    }


    @Test
    public void testLectureEffectOnInstructor(){
        //Given
        Instructor instructor = new Instructor(234L);
        Student holly = new Student(225L);
        Student matt = new Student(226L);
        Student ray = new Student(227L);
        Learner[] learners = new Learner[]{holly, matt, ray};



        //When
        instructor.lecture(learners, 3.0);
        double expected = 1.0;
        double actual = instructor.getTotalNumberOfHoursPerLearner();

        //Then
        Assert.assertEquals(expected,actual,0.0);
    }


}







