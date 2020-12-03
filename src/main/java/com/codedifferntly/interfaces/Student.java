package com.codedifferntly.interfaces;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id) {
        super("Ray", id);
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
