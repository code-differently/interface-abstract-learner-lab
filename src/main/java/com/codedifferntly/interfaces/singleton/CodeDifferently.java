package com.codedifferntly.interfaces.singleton;

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
        //Lazy Instanciation
        if (instance == null)
            instance = new CodeDifferently();
        return instance;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        System.out.println(students);
        System.out.println("students.count is " + students.getCount());

        System.out.println(students.getArray());

        teacher.lecture( (Learner[])students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {

    }




}
