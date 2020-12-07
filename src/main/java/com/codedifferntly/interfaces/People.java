package com.codedifferntly.interfaces;

import java.util.ArrayList;

public class People {
     ArrayList<Person> personList;

    public People(){
        //this.personList = personList;
        personList = new ArrayList<Person>();
    }

    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(long id) {
        //return personList.get((int)id);
        for (Person person : personList){
            if (person.getId() == id)
                return person;
        }
        return null;
    }
    public void remove(Person person) {
        this.personList.remove(person);

    }
    public void remove(long id) {
        //this.personList.remove(id);
        Person person = findById(id);
        if (person != null)
            remove(person);
    }
    public int getCount() {
        return personList.size();
    }
    public Person[] getArray() {
        Person[] person = new Person[personList.size()];
        for (int index = 0; index < person.length; index++){
            person[index] = personList.get(index);
        }
        return person;
    }
    public void removeAll() {

    }
}
