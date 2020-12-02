package com.codedifferntly.interfaces;

//   Create an Instructor class such that:
//        Instructor is a subclass of Person
//        Instructor implements the Teacher interface
//        Instructor should have a concrete implementation of the teach method which invokes the learn method on the specified Learner object.
//        Instructor should have a concrete implementation of the lecture method which invokes the learn method on each of the elements in the specified array of Learner objects.
//        numberOfHours should be evenly split amongst the learners.
//        double numberOfHoursPerLearner = numberOfHours / learners.length;

import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.Learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
