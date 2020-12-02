package com.codedifferntly.interfaces;

public class Student implements Learner {
    private Double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
