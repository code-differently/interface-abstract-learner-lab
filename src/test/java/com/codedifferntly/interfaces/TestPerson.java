package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

	private Person person;

	@Test
	public void testConstructor(){
		//Arrange
		person = new Person(1);
		//Act
		long actual = person.getId();
		long expected = 1;
		//Arrange
		Assert.assertEquals("hasNoID",expected,actual);
	}

	@Test
	public void testSetName(){
		//Arrange
		person = new Person(1);
		person.setName("JohnJon");
		//Act
		String actual = person.getName();
		String expected = "JohnJon";
		//Arrange
		Assert.assertEquals("hasNoName",expected,actual);
	}


}
