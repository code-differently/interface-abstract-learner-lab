package com.codedifferntly.interfaces.singletons;

//    Create a CodeDifferently singleton.
//        The class should declare a field that references the instance of Students called students.
//        The class should declare a field that references the instance of Instructors called instructors.
//        The class should define a method hostLecture which makes use of a Teacher teacher, double numberOfHours parameter to host a lecture to the composite people field in the students reference.
//        The class should define a method hostLecture which makes use of a long id, double numberOfHours parameter to identify a respective Instructor to host a lecture to the composite people field in the cohort reference.

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.Student;
import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;

public final class CodeDifferently {

    private static CodeDifferently INSTANCE = new CodeDifferently();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private CodeDifferently() {

    }

    public static CodeDifferently getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

}
