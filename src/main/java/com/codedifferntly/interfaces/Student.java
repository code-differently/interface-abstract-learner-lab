package com.codedifferntly.interfaces;

public class Student extends Person implements Learner{

    private double totalStudyTime;

    public Student(long id) {
        super(id);
    }
        @Override
        public void learn(double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
        }
        public double getTotalStudyTime(){
            return totalStudyTime;
        }

    public void learn() {
    }
}


