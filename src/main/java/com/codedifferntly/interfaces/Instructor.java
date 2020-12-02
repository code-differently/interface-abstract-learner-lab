package com.codedifferntly.interfaces;

public class Instructor extends Person implements Teacher{
    double numberOfHours;
    double totalNumberOfHoursPerLearner;

    public Instructor(Long id){
        super(id);
    }


    @Override
    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
        totalNumberOfHoursPerLearner += numberOfHours;
    }

    @Override
    public void lecture(Learner[]learners, double numberOfHours) {
        for (Learner learner : learners) {
            learner.learn(numberOfHours);
        }
        totalNumberOfHoursPerLearner += numberOfHours / learners.length;
    }
    public double getTotalNumberOfHoursPerLearner(){
            return totalNumberOfHoursPerLearner;
        }


}
