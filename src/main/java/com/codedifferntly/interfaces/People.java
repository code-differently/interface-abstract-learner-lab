package com.codedifferntly.interfaces;

import java.util.ArrayList;

class People {

    protected ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person) {
        this.personList.add(person);
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
}


