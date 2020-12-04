package com.codedifferntly.interfaces.singletons;

//   Part 8.0 - Create and Test Instructors singleton
//        Use Part 7 as a reference.
//        Create a Instructors singleton which represents the set of instructors at Code Differently.
//        Create a TestInstructors class.

import com.codedifferntly.interfaces.Instructor;

import com.codedifferntly.interfaces.People;

final public class Instructors extends People {

    public static Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor gabriella = new Instructor(995, "Gabriella");
        Instructor tariq = new Instructor(999, "Tariq");
        Instructor iyasu = new Instructor(456, "Iyasu");
        Instructor stephen = new Instructor(987, "Stephen");
        Instructor franKie = new Instructor(225, "FranKie");
        Instructor rahmir = new Instructor(161, "Rahmir");
        Instructor oN = new Instructor(01, "Faith");
        Instructor eugene = new Instructor(556, "uegine");

        add(gabriella);
        add(tariq);
        add(iyasu);
        add(stephen);
        add(franKie);
        add(rahmir);
        add(oN);
        add(eugene);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
