package com.codedifferntly.interfaces;

public class Person {
    long id;
    String name;

    public Person(final long id, String name){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    }


