package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestPeople {
	private  People people;

	@Test
	public void testAdd(){
		//Act
		Person student1 = new Student(24L);
		people = new People();
		people.add(student1);

		//Arrange
		Object actual = people.personList.get(0);

		//Assert
		Assert.assertEquals(student1, actual);
	}

	@Test
	public void findById(){
		//Act
		Person student1 = new Student(24L);
		Person student2 = new Student(23L);
		people = new People();
		people.add(student1);
		people.add(student2);
		//Arrange
		Object expected = people.personList.get(0);
		Object actual = people.findById(23L);
		//Assert
		Assert.assertEquals(expected,actual);

	}

	@Test
	public void testRemoveByPerson() {
		//Act
		Person student1 = new Student(24L);
		Person student2 = new Student(25L);
		people = new People();
		people.add(student1);
		people.add(student2);
		//Arrange
		people.removeByPerson(student2);
		//Assert
		Assert.assertFalse(people.personList.contains(student2));


	}
	@Test
	public void testRemoveById(){
		//Act
		Person student1 = new Student(24L);
		Person student2 = new Student(25L);
		people = new People();
		people.add(student1);
		people.add(student2);
		//Arrange
		people.removeById(24L);
		//Assert
		Assert.assertFalse(people.personList.contains(student1));
	}
	@Test
	public void testRemoveAll(){
		//Act
		Person student1 = new Student(24L);
		Person student2 = new Student(23L);
		Person student3 = new Student(25L);
		people = new People();
		people.add(student1);
		people.add(student2);
		people.add(student3);
		//Arrange
		people.removeAll();
		//Assert
		Assert.assertTrue(people.personList.isEmpty());
	}

}
