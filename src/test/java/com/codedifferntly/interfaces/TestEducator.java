package com.codedifferntly.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static com.codedifferntly.interfaces.Educator.TARIQ;

public class TestEducator {

    @Test
    public void testImplementation() {
        Assert.assertTrue(TARIQ instanceof Teacher);

    }

    @Test
    public void testTimeWorked() {
        //Given
        Student student = new Student(789L);


        //When
        Educator.TARIQ.teach(student, 5.0);
        double expected = 5.0;
        double actual = TARIQ.getTimeWorked();

        //Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testTimeWorkedWhenTeachAndLecture() {
        //Given
        Student student = new Student(789L);
        Student holly = new Student(225L);
        Student matt = new Student(226L);
        Student ray = new Student(227L);
        Learner[] learners = new Learner[]{holly, matt, ray};


        //When
        Educator.TARIQ.teach(student, 5.0);
        TARIQ.lecture(learners, 3.0);
        double expected = 8.0;
        double actual = TARIQ.getTimeWorked();

        //Then
        Assert.assertEquals(expected, actual, 0.0);

    }

    @After
    public void resetTimeWorked() {
        Instructors.getInstance().personList.forEach(instructor -> {
            instructor.timeWorked = 0;
        });
    }
}
