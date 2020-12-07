package com.codedifferntly.interfaces;

public class Person implements Identifiable {
    Long id;
    String name;

    public Person(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
       this.name = name;
    }

}

