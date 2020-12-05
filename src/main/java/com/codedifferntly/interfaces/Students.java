package com.codedifferntly.interfaces;

import java.util.ArrayList;

public class Students extends People{

   private static Students instance = new Students();

     private Students() {
         add(new Student(234L, "Sam"));
         add(new Student(235L, "Holly"));
         add(new Student(236L, "Ray"));
         add(new Student(237L, "Lovebug"));
         add(new Student(238L, "Mike"));

     }

     public static Students getInstance(){
         if (instance == null)
             instance = new Students();
         return instance;

         }
     }

