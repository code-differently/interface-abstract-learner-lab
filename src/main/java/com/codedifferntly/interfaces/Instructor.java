package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;
import com.codedifferntly.interfaces.interfaces.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name){
        super(id,name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.Learn(numberOfHours);
    }

    @Override
    public void lecture(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

                   for(Learner learner : learners){
                learner.Learn(numberOfHours);
            }
    }
}
