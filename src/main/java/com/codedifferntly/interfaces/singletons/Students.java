package com.codedifferntly.interfaces.singletons;

public class Students {
    private static Students INSTANCE = new Students();

    private Students(){

    }
    public static Students getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Students();
         return INSTANCE;
    }
}
