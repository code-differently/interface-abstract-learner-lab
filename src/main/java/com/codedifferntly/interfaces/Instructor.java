package com.codedifferntly.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {

        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours){
        learner.Learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.Learn(numberOfHoursPerStudent);
        }
    }
    }