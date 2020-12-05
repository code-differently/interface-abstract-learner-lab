package com.codedifferntly.interfaces;

import java.util.ArrayList;

class People {

    protected ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person) {
        this.personList.add(person);
    }
    
    public void remove(Person person) {
        Person personToRemove = person;
        
        personList.removeIf(p -> personToRemove == p);
    }
    
    public void remove(long id) {
        long idToRemove = id;
        Person personToRemove = findById(id);
        personList.removeIf(p -> personToRemove == p);
    }

    public Person findById(long id) {

        Person personOfInterest = null;

        for (Person p : personList) {
            if (id == p.getId()) {
                personOfInterest = p;
            }
        }
        return personOfInterest;
    }

    public void removeAll() {
        personList.clear();
    }

}


