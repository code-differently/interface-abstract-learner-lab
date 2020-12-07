package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id) {
        super(id);
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
