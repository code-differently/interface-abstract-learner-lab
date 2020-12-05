package com.codedifferntly.interfaces;
/*
The class should declare a field that references the
 instance of Students called students.
The class should declare a field that references the
instance of Instructors called instructors.
The class should define a method hostLecture which makes
use of a Teacher teacher, double numberOfHours parameter to
 host a lecture to the composite people field in the students reference.
The class should define a method hostLecture which makes use
 of a long id, double numberOfHours parameter to identify a
  respective Instructor to host a lecture to the composite people
   field in the cohort reference.
 */

import java.util.Arrays;
import java.util.List;

public class CodeDifferently {

    private static CodeDifferently instance = new CodeDifferently();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private CodeDifferently(){

    }
    public static CodeDifferently getInstance(){
        if(instance == null)
            instance = new CodeDifferently();
        return instance;
    }

    public static void hostLecture(Teacher teacher, double numberOfHours){
        List<Object> studentsList = Arrays.asList(Students.getInstance().getArray());
        Student[] studentsArray = new Student[studentsList.size()];
        studentsList.toArray(studentsArray);
        teacher.lecture(studentsArray,numberOfHours);
    }

    public static void hostLecture(Long id, double numberOfHours){
        List<Object> studentsList = Arrays.asList(Students.getInstance().getArray());
        Student[] studentsArray = new Student[studentsList.size()];
        studentsList.toArray(studentsArray);
        Teacher teacher =(Teacher) Instructors.getInstance().findById(id);
        teacher.lecture(studentsArray,numberOfHours);



    }
}
