package com.codedifferntly.interfaces;

public class Person implements Learner {

    private final long id;
    private String name;

    public Person(String name, long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void learn(double numberOfHours) {

    }
}
