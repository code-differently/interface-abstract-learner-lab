package com.codedifferntly.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(long id) {
        super("Ray", id);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner l : learners) {
            l.learn(numberOfHours);
        }
    }
}
