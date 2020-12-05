package interfaces.Singletons;

import com.codedifferntly.interfaces.People;

public class Instructors extends People {

    final static Instructors Instance = new Instructors();

    private Instructors() {

    }
    public static Instructors getInstance() {
        return Instance;
    }
}
