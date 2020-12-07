package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Student;

final public class Students extends People {

     private static final Students INSTANCE = new Students();

     private Students() {
         Student abi = new Student(23);
         Student mancub = new Student(24);
         Student damian = new Student(25);
         Student giwa = new Student(26);
         Student ralf = new Student(27);

         add(abi);
         add(mancub);
         add(damian);
         add(giwa);
         add(ralf);
     }

     public static Students getInstance() {
         return INSTANCE;
     }

}
