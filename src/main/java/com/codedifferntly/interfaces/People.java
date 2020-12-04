package com.codedifferntly.interfaces;

import java.util.ArrayList;


public class People {
    ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(Long id) {
        personList.remove(id);
    }

    public Person findById(Long id) {
        for (Person person : personList) {
            if (id.equals(person.getId()))
                return person;
            }
        return null;
    }

    public Integer getCount(){
        Integer count = personList.size();
        return count;
    }

    public String[] getArray(){
        String[] personListArray = personList.toArray(new String[0]);
        return personListArray;
    }
    public void removeAll(){
        personList.clear();
    }
}
