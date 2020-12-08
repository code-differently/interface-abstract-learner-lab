package com.codedifferntly.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public Student(long id) {
        super(id);

    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTestStudyTime(){
        return this.totalStudyTime;
    }

}
