package com.codedifferntly.interfaces;

public class Student extends Person implements Learner {

    public Student(long id) {
        super(id);
    }
    public double totalStudyTime;

    @Override
    public void learn(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
