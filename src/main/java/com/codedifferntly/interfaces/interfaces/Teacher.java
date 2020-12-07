package com.codedifferntly.interfaces.interfaces;

public interface Teacher {
    public void teach(Learner learner, double numberOfHours);
    public void lecture(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);
}
