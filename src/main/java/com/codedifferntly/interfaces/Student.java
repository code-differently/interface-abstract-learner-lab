package com.codedifferntly.interfaces;

public class Student extends Person implements Learner{

    private double totalStudyTime;


    public Student(Long id, String name){
        super(id, name);
        this.totalStudyTime = 6;
    }

    @Override
    public double Learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
//totalStudyTime = totalStudyTime + numberOfHours
        return totalStudyTime;
    }
    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
