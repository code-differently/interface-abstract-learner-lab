package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestInstructor {
    @Test
    public void testImplementation () {
        //Given
        Instructor instructor = new Instructor(500);

        //When

        //Then
        Assert.assertThat(instructor, instanceOf(Teacher.class));
    }

   @Test
   public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(500);

        //When

       //Then
        Assert.assertThat(instructor, instanceOf(Person.class));
   }

   @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(500);
        Student student = new Student(23);

        //When
        instructor.teach(student, 3.0);

        //Then
       Assert.assertEquals(3.0, student.getTestStudyTime(), 0.0);
   }
    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor(500);


        //When

        //Then
    }
}

