package com.codedifferntly.interfaces.singleton;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Person;
import com.codedifferntly.interfaces.Student;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){
        add(new Student(007, "Mike"));
        add(new Student(015, "Daniel"));
        add(new Student(001, "Victor"));
        add(new Student(147, "Abi"));

    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
