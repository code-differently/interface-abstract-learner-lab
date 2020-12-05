package com.codedifferntly.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class People {

	ArrayList<Person> personList = new ArrayList<Person>();

	public void add (Person person){
		personList.add(person);
	}

	public Person findById (Long id){
		for(Person person : personList)
		{
			Long defId = person.getId();
			if (defId.equals(id)){
				return person;
			}
		}
			return null;
	}

	public void removeByPerson(Person person){
		personList.remove(person);
	}

	public void removeById(Long id){
		Person person = findById(id);
		removeByPerson(person);
	}

	public void removeAll(){
		Iterator <Person>itr = personList.iterator();

		while(itr.hasNext()){
			itr.next();
			if(!personList.isEmpty()){
			itr.remove();
			}
		}
	}

	public Integer getCount (){
		return personList.size();
	}

	public Person[] getArray(){
		Person[] personArr = new Person[personList.size()];
		personArr = personList.toArray(personArr);
		return personArr;
	}

}


