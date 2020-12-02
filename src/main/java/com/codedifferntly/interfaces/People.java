package com.codedifferntly.interfaces;

import java.util.*;



public class People extends Person {



    private final Object Person;

    public People(long id, String name, Object person) {
        super(id, name);
        Person = person;

        ArrayList<Person> personList = new ArrayList<Person>();

        personList.add(getPerson(person));
        personList.remove(getId());

        Object findById = personList.remove(getId());

    }
    private com.codedifferntly.interfaces.Person getPerson(Object person) {
        return null;
    }

}





