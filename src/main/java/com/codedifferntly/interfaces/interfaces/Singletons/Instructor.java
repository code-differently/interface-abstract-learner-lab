package com.codedifferntly.interfaces.Singletons;

import com.codedifferntly.interfaces.Person;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }


}
