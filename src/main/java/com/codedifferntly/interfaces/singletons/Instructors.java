package com.codedifferntly.interfaces.singletons;

public class Instructors {
    private static Instructors INSTANCE = new Instructors();

    private Instructors(){

    }
    public static Instructors getInstance(){
        if(INSTANCE == null)
            INSTANCE = new Instructors();
        return INSTANCE;
    }
}
