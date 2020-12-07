package com.codedifferntly.interfaces;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {

	private Instructor instructor;

	@Test
	public void testImplementation(){
		//Given
		Long id = 234L;

		//When
		instructor = new Instructor(id);

		//Then
		Assert.assertTrue(instructor instanceof  Teacher);
	}
	@Test
	public void testInheritance(){
		//Arrange
		Long id = 234L;

		//Act
		instructor = new Instructor(id);

		//Assert
		Assert.assertTrue(instructor instanceof Person);
	}

	@Test
	public void testTeach(){
		//Act
		instructor = new Instructor(1);
		Student student = new Student(2);
		instructor.teach(student,2);
		instructor.teach(student,2);

		//Arrange
		double actual = student.getTotalStudyTime();
		double expected = 4;

		//Assert
		Assert.assertEquals(expected,actual,0.01);
	}

	@Test
	public void testLecture(){
		//Act
		instructor = new Instructor(24);
		Student student1 = new Student(1);
		Student student2 = new Student(2);
		Learner[] learners = {student1,student2};
		instructor.lecture(learners,4);
		instructor.lecture(learners,4);

		//Arrange
		double actual = ((Student)learners[0]).getTotalStudyTime();
		double expected = 4;

		//Act
		Assert.assertEquals(expected,actual,0.01);
	}
}