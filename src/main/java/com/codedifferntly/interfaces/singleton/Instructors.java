package com.codedifferntly.interfaces.singleton;

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.People;

    public final class Instructors extends People {

        public static Instructors INSTANCE = new Instructors();

        private Instructors(){

            add(new Instructor(995, "Gabriella"));
            add(new Instructor(999, "Tariq"));
            add(new Instructor(456, "Iyasu"));
            add(new Instructor(987, "Stephen"));
            add(new Instructor(225, "FranKie"));
            add(new Instructor(161, "Rahmir"));
            add(new Instructor(01, "Faith"));
            add(new Instructor(556, "eugune"));
        }

        public static Instructors getInstance() {
            return INSTANCE;
        }
}
