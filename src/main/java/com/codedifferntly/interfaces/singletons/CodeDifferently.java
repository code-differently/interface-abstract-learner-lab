package com.codedifferntly.interfaces.singletons;
import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.Person;
import com.codedifferntly.interfaces.Student;
import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;
public class CodeDifferently {

    private static CodeDifferently INSTANCE = null;
    private Students students  = Students.getInstance();
    private Instructors instructors = Instructors.getInstance(); ;

    private CodeDifferently(){

   }
    public static CodeDifferently getInstance(){
        //lazy instantiation
        if (INSTANCE == null)
            INSTANCE = new CodeDifferently();
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Student[] studentArray = students.getArray();
        teacher.lecture((Student[])students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor)instructors.findById(id);
        instructor.lecture((Student[])students.getArray(), numberOfHours);


    }

}
