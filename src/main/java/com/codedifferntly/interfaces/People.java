package com.codedifferntly.interfaces;

import java.util.ArrayList;

class People {

    ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(Long id) {

        return null;
    }
}


