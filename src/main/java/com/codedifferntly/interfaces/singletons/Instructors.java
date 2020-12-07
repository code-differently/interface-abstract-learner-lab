package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.People;

final public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor tariq = new Instructor(1);
        Instructor eugene = new Instructor(2);
        Instructor rahmir = new Instructor(3);
        Instructor stephen = new Instructor(4);
        Instructor gabriella = new Instructor(5);
        Instructor iyasu = new Instructor(6);
        Instructor faith = new Instructor(7);

        add(tariq);
        add(eugene);
        add(rahmir);
        add(stephen);
        add(gabriella);
        add(iyasu);
        add(faith);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

}
