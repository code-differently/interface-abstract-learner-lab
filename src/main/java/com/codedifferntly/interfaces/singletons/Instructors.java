package com.codedifferntly.interfaces.singletons;

//   Part 8.0 - Create and Test Instructors singleton
//        Use Part 7 as a reference.
//        Create a Instructors singleton which represents the set of instructors at Code Differently.
//        Create a TestInstructors class.

import com.codedifferntly.interfaces.Instructor;

import com.codedifferntly.interfaces.People;

final public class Instructors extends People {

    private static Instructors instance;

    private Instructors() {
        add(new Instructor(995, "Gabriella"));
        add(new Instructor(999, "Tariq"));
        add(new Instructor(456, "Iyasu"));
        add(new Instructor(987, "Stephen"));
        add(new Instructor(225, "FranKie"));
        add(new Instructor(161, "Rahmir"));
        add(new Instructor(01, "Faith"));
        add(new Instructor(556, "uegine"));
    }

    public static Instructors getInstance() {
        if (instance == null)
            instance = new Instructors();
        return instance;
    }
}
