package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.People;


public class Instructors extends People {
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

   public static Instructors getInstance(){
        return INSTANCE;
    }
}
