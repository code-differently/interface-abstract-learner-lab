package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
	private Student student;

	@Test
	public void testImplementation(){
		//Arrange
		Long id = 123L;
		//Act
		student = new Student(id);

		//Assert
		Assert.assertTrue(student instanceof Learner);
	}

	@Test
	public void testInheritance(){
		//Arrange
		Long id = 242L;
		//Act
		student = new Student(id);
		//Assert
		Assert.assertTrue(student instanceof Person);
	}

	@Test
	public void testLearn(){
		//Arrange
		student = new Student(1);
		student.learn(1.30);
		student.learn(5);
		//Act
		double actual = student.getTotalStudyTime();
		double expected = 6.30;
		//Assert
		Assert.assertEquals(expected,actual,0.01);
	}
}
