package com.codedifferntly.interfaces;

public class Instructors extends People<Instructor>{

    private static Instructors instance = new Instructors();

    private Instructors(){
        add(new Instructor(543L, "Tariq"));
        add(new Instructor(542L, "Frankie"));
        add(new Instructor(541L, "Faith"));
    }
    public static Instructors getInstance(){
        if(instance == null)
            instance = new Instructors();
        return instance;

    }
    public Instructor[] getArray(){
        Instructor[] instructorsArray = Instructors.getInstance().getArray();
        return instructorsArray;
    }
}
