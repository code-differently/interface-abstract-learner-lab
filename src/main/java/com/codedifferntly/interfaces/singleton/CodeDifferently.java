package com.codedifferntly.interfaces.singleton;

import com.codedifferntly.interfaces.People;
import com.codedifferntly.interfaces.Student;
import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;

public class CodeDifferently {

    private  static  CodeDifferently instance = null;
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private CodeDifferently(){

    }
    public static CodeDifferently getInstance() {
        //Lazy Instantiation
        if (instance == null)
            instance = new CodeDifferently();
        return instance;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

       teacher.lecture((Learner[])students.getArray(), numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours) {

    }




}
