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

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        Student sam = new Student(443, "Sam");
        Student gabriella = new Student(995, "Gabriella");
        Student aakriti = new Student(968, "Aakriti");
        Student camelCashMoney = new Student(8, "Victor$$");
        Student michael = new Student(007, "Michael$$");
        Student Sam = new Student(443, "Sam");
        Student danielleD = new Student(15, "Danielle D");
        Student abi = new Student(147, "Abi");
        Student lachelle = new Student(050, "Lachelle");

        add(sam);
        add(gabriella);
        add(aakriti);
        add(camelCashMoney);
        add(michael);
        add(Sam);
        add(danielleD);
        add(abi);
        add(lachelle);
    }



    public static Students getInstance() {
        return INSTANCE;
    }

}
