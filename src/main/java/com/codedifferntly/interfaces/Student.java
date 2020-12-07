package com.codedifferntly.interfaces;

import com.codedifferntly.interfaces.interfaces.Learner;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id, String name){
        super(id, name);
        this.totalStudyTime = 10.0;
    }

    @Override
    public void Learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
