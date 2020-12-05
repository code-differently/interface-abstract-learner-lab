package com.codedifferntly.interfaces;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
