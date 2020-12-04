package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Person;

final public class Instructors extends People {
    private static Instructors INSTANCE = new Instructors();

    private Instructors(){
        Person Tariq = new Person(443, "Tariq");
        Person gabi = new Person(995, "gabi");
        Person Iyasu = new Person(444, "Iyasu");
        Person Steven = new Person(445, "Steven");
        Person Faith = new Person(446, "Faith");
        Person Frankie = new Person(447, "Frankie");
        Person Rhameer = new Person(448, "Rhameer");
        Person Eugene = new Person(443, "Eugene");

        add(Tariq);
        add(gabi);
        add(Iyasu);
        add(Steven);
        add(Faith);
        add(Frankie);
        add(Rhameer);
        add(Eugene);
    }
    public static Instructors getInstance(){
        if(INSTANCE == null)
          INSTANCE = new Instructors();
        return INSTANCE;
    }
}
