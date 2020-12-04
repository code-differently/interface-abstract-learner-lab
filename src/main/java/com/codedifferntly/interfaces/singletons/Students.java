package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Person;

public class Students extends People {
    private static Students INSTANCE = new Students();

    private Students(){
        Person sam = new Person(443, "sam");
        Person gabi = new Person(995, "gabi");
        Person Aakriti = new Person(444, "Aakriti");
        Person camelCashMoney = new Person(445, "camelCashMoney");
        Person mike = new Person(446, "mike");
        Person danielle = new Person(447, "danielle");
        Person abi = new Person(448, "abi");
        Person lachell = new Person(443, "lachell");

        add(sam);
        add(gabi);
        add(Aakriti);
        add(camelCashMoney);
        add(mike);
        add(danielle);
        add(abi);
        add(lachell);

    }
    public static  Students getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Students();
         return INSTANCE;
    }
}
