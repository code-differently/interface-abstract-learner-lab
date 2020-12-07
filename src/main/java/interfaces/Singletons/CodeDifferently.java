package interfaces.Singletons;


import interfaces.Learner;
import interfaces.Teacher;

public final class CodeDifferently {

    private static CodeDifferently INSTANCE = new CodeDifferently();
    private Students student = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private CodeDifferently() {

    }


    public static CodeDifferently getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        System.out.println(students);
        System.out.println("students.count is " + students.getCount());

        System.out.println(students.getArray());

        teacher.lecture( (Learner[]) students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){

    }

}
