package com.codedifferntly.interfaces;

public class Student  extends Person implements Learner{
    double totalStudyTime;
    double numberOfHours;

    public Student(Long id){
        super(id);
    }

    public Student(Long id, String name){
        super(id);
        this.name=name;
    }

    @Override
    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;
    }
    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
