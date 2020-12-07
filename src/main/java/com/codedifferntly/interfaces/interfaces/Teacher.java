package com.codedifferntly.interfaces.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;

public interface Teacher {

    void teach(Learner learner, double numberOfHours);
    void lecture(Learner[] learners, double numberOfHours);
}
