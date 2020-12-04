package com.codedifferntly.interfaces;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id) {
        super(id, "Ray");
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
