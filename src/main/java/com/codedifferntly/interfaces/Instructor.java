package com.codedifferntly.interfaces;

public class Instructor extends Person implements Teacher{

	public Instructor(long id){
		super(id);
	}

	public void teach(Learner learner, double numberOfHours){
		learner.learn(numberOfHours);
	}

	public void lecture(Learner[] learners, double numberOfHours){

		for (Learner learner : learners) {
			double numberOfHourPerLearner = numberOfHours / learners.length;
			learner.learn(numberOfHourPerLearner);
		}

	}
}
