package com.codedifferntly.interfaces.singletons;

//   Note: The creation of this class will demonstrate an implementation of singleton design pattern.
//        Create a Students class.
//        The class should be an unextendable subclass of the People class.
//        The class should statically instantiate a final field named INSTANCE of type Students.
//        The class should define a private nullary constructor which populates the INSTANCE field with respective Student representations of your colleagues.
//        Each student should have a relatively unique id field.
//        The class should define a getInstance method which returns the INSTANCE field.

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Person;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        Person sam = new Person(443, "Sam");
        Person gabriella = new Person(995, "Gabriella");
        Person aakriti = new Person(968, "Aakriti");
        Person camelCashMoney = new Person(8, "Victor$$");
        Person michael = new Person(007, "Michael$$");
        Person Sam = new Person(443, "Sam");
        Person danielleD = new Person(15, "Danielle D");
        Person abi = new Person(147, "Abi");
        Person lachelle = new Person(050, "Lachelle");

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
