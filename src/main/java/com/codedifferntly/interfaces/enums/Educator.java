package com.codedifferntly.interfaces.enums;

import com.codedifferntly.interfaces.Instructor;
import com.codedifferntly.interfaces.Person;
import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;
import com.codedifferntly.interfaces.singletons.Instructors;

public enum Educator implements Teacher {

    GABRIELLE(100L, "Gabrielle"), TARIQ(200L, "Tariq"), EUGENE(300L, "Eugene"),
    IYASU(400L, "Iyasu"), STEPHEN(500L, "Stephen"), FRANKIE(600L, "FranKie"),
    RAHMIR(700L, "Rahmir"), FAITH(800L, "Faith");

    private final Instructor instructor;
    private double timeWorked;

    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
        this.timeWorked = 0;
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked++;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
