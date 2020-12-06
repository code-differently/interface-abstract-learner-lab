package com.codedifferntly.interfaces;

import java.util.ArrayList;


public class People {


    protected ArrayList<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person p : personList) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        Person person = findById(id);
        if (person != null) {
            remove(person);
        }
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        Person[] person = new Person[personList.size()];
        for (int i = 0; i < person.length; i++)
            person[i] = personList.get(i);
        return person;
    }

}







