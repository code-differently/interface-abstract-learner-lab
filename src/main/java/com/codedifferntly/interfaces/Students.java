package com.codedifferntly.interfaces;



public class Students{
	People people = new People();
	static final Students INSTANCE = new Students();

	private Students(){
		
	}

	public static Students getInstance() {
		return INSTANCE;
	}
}
