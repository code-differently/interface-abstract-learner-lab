package com.codedifferntly.interfaces;

import java.util.ArrayList;


public abstract class People<E extends Person>{
    ArrayList<E> personList = new ArrayList<>();

    public void add(E person) {
        personList.add(person);
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(Long id) {
        personList.remove(id);
    }

    public E findById(Long id) {
        for (E person : personList) {
            if (id.equals(person.getId()))
                return person;
            }
        return null;
    }

    public Integer getCount(){
        Integer count = personList.size();
        return count;
    }

    public abstract E[] getArray();

    public void removeAll(){
        personList.clear();
    }
}
