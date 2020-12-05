package com.codedifferntly.interfaces.singletons;

//   Note: The creation of this class will demonstrate an implementation of singleton design pattern.
//        Create a Students class.
//        The class should be an unextendable subclass of the People class.
//        The class should statically instantiate a final field named INSTANCE of type Students.
//        The class should define a private nullary constructor which populates the INSTANCE field with respective Student representations of your colleagues.
//        Each student should have a relatively unique id field.
//        The class should define a getInstance method which returns the INSTANCE field.

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student> {

    private static Students instance;

    private List<Student> stds = new ArrayList<Student>();

    private Students() {
        add(new Student(443, "Sam"));
        add(new Student(995, "Gabriella"));
        add(new Student(968, "Aakriti"));
        add(new Student(8, "Victor$$"));
        add(new Student(007, "Michael$$"));
        add(new Student(443, "Sam"));
        add(new Student(15, "Danielle D"));
        add(new Student(147, "Abi"));
        add(new Student(050, "Lachelle"));
    }

    // return getPersonList().toArray() didn't work. So need to loop through values and create an array instead.
    @Override
    public Student[] getArray() {
        ArrayList<Student> studentList = getPersonList();
        Student[] students = new Student[getPersonList().size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = studentList.get(i);
        }
        return students;
    }

    public static Students getInstance() {
        if (instance == null)
            instance = new Students();
        return instance;
    }

}
