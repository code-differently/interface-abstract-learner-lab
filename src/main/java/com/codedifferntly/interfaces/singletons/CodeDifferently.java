package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.interfaces.Teacher;

//Create a CodeDifferently singleton.
//        The class should declare a field that references the instance of Students called students.
//        The class should declare a field that references the instance of Instructors called instructors.
//        The class should define a method hostLecture which makes use of a Teacher teacher, double numberOfHours parameter to host a lecture to the composite people field in
//        the students reference.
//        The class should define a method hostLecture which makes use of a long id, double numberOfHours parameter to identify a respective Instructor to host a lecture to
//        the composite people field in the cohort reference.

public class CodeDifferently {
    private static CodeDifferently instance = null;
    Students students;
    Instructors instructors;

    private CodeDifferently() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static CodeDifferently getInstance(){
        //lazy instantiation
        if (instance == null)
            instance = new CodeDifferently();
        return instance;
    }

    private void hostLecture(Teacher teacher, double numberOfHours) {

    }

    private void hostLecture(long id, double numberOfHours) {

    }

}
