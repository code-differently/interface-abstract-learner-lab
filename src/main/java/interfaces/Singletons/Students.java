package interfaces.Singletons;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Student;

public final class Students extends People {

    private static final Students Instance = new Students();

    private Students() {
        Student sam = new Student(443, "Sam");
        Student gabriella = new Student(995, "Gabriella");
        Student aakriti = new Student(968, "Aakriti");
        Student victor = new Student(8, "Victor");
        Student michael = new Student(007, "Michael");
        Student danielleD = new Student(15, "Danielle D");
        Student abi = new Student(147, "Abi");
        Student lachelle = new Student(050, "Lachelle");

        add(sam);
        add(gabriella);
        add(aakriti);
        add(victor);
        add(michael);
        add(sam);
        add(danielleD);
        add(abi);
        add(lachelle);
    }

   // condensed version     add(new Person(456, "Matt"));


    public static Students getInstance() {

        return Instance;
    }
}
