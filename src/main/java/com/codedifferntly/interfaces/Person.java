package com.codedifferntly.interfaces;


public class Person {
	private final long id;
	private String name;


	public Person (long id){
		this.id = id;
	}


	public long getId() {
		return id;
	}

	public String getName(){
		return name;
	}

	public void setName(String newName){
		this.name = newName;
	}
}
