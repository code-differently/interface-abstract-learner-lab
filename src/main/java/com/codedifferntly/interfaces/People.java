package com.codedifferntly.interfaces;

import java.util.ArrayList;

class People {

    protected ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person) {
        this.personList.add(person);
    }

    public void remove(Person person) {

        // I wrote a foreach, intellij offered this
        // I'm digging in to understand it better.
        personList.removeIf(p -> person == p);
    }

    public void remove(long id) {
        Person personToRemove = findById(id);
        // I wrote a foreach, intellij offered this
        // I'm digging in to understand it better.
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

    public Integer getCount() {
        return personList.size();
    }

}


