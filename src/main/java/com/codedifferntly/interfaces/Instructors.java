package com.codedifferntly.interfaces;

public class Instructors extends People<Educator>{

    private static Instructors instance = new Instructors();

    private Instructors(){
        add(Educator.TARIQ);
        add(Educator.FRANKIE);
        add(Educator.FAITH);
    }
    public static Instructors getInstance(){
        if(instance == null)
            instance = new Instructors();
        return instance;

    }
    public Educator[] getArray(){
        Educator[] instructors = new Educator[personList.size()];
        for(int i=0; i < personList.size(); i++){
            instructors[i]  = personList.get(i);
        }
        return instructors;
    }
}
