package com.codedifferntly.interfaces;

//Part 6.1 - Create People class
//    Create a People class.
//        The class should instantiate an ArrayList field of Person objects named personList.
//        The class should define a method named add which adds a Person to the personList.
//        The class should define a method named findById which makes use of a long id parameter to return a Person object with the respective id field.
//        The class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.
//        The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.
//        The class should define a method named getCount which returns the size of personList.
//        The class should define a method named getArray which returns an array representation of the personList field.
//        The class should define a named removeAll which clears our personList field.

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList;

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
        if (person != null)
            remove(person);
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        return null;
    }

    public void removeAll() {

    }
}
