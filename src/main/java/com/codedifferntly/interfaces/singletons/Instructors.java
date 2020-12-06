package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Student;


public class Instructors extends People<Instructor> {
   final private static Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(441, "Tariq"));
        add(new Instructor(443, "gabi"));
        add(new Instructor(444, "Iyasu"));
        add(new Instructor(445, "Steven"));
        add(new Instructor(446, "Faith"));
        add(new Instructor(447, "Frankie"));
        add(new Instructor(448, "Rhameer"));
        add(new Instructor(442, "Eugene"));

    }

    @Override
    public Instructor[] getArray() {
        Instructor[] instructor = new Instructor[personList.size()];
        for (int i = 0; i < instructor.length; i++) {
            instructor[i] =  personList.get(i);
        }
        return instructor;
    }
   public static Instructors getInstance(){
        return INSTANCE;
    }
}
