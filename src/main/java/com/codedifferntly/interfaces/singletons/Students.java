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

public final class Students extends People<Student> {

    private static Students instance;

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

    @Override
    public Student[] getArray() {
        //return new Student[0]; // auto generated by IntelliJ
        return null;
    }

    public static Students getInstance() {
        if (instance == null)
            instance = new Students();
        return instance;
    }

}
