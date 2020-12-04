package com.codedifferntly.interfaces.singleton;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Person;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){
        add(new Person(007, "Mike"));
        add(new Person(015, "Daniel"));
        add(new Person(001, "Victor"));
        add(new Person(147, "Abi"));

    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
