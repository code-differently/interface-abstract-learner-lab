package com.codedifferntly.interfaces;

class Students extends People {

    static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(123, "Ray Cool"));
    }
}
