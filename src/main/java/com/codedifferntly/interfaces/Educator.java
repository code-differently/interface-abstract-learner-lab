package com.codedifferntly.interfaces;

public enum Educator implements Teacher {
    TARIQ(543L, "Tariq"),
    FRANKIE(542L, "Frankie"),
    FAITH (541L, "Faith");

    double timeWorked;
    final Instructor instructor;

    Educator( long id, String name){
        instructor = new Instructor(id, name);
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
    instructor.teach(learner, numberOfHours);
    this.timeWorked= instructor.numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
    instructor.lecture(learners,numberOfHours);
    this.timeWorked = instructor.numberOfHours;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
