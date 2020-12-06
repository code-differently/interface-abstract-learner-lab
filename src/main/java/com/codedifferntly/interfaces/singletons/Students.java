package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Person;
import com.codedifferntly.interfaces.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student> {

   private static Students INSTANCE = null;

    private Students(){
        add(new Student(410, "sam"));
        add(new Student(995, "gabi"));
        add(new Student(968, "aakriti"));
        add(new Student(8, "victor$$"));
        add(new Student(007, "mike"));
        add(new Student(15, "danielle D"));
        add(new Student(147, "abi"));
        add(new Student(050, "lachelle"));

    }

    @Override
    public Student[] getArray() {
        Student[] students = new Student[personList.size()];
        for(int i=  0; i <students.length;i++){
            students[i] = (Student) personList.get(i);
        }
        return students;
      //  return this.
    }

    public static  Students getInstance() {
        if(INSTANCE == null)
            INSTANCE = new Students();
        return INSTANCE;
    }
}
