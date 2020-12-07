package com.codedifferntly.interfaces;

import java.util.ArrayList;


public abstract class People<E extends Person> {


    protected ArrayList<E> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E p : personList) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long id) {
        E person = findById(id);
        if (person != null) {
            remove(person);
        }
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();

}







