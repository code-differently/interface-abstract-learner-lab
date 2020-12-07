package com.codedifferntly.interfaces.enums;

import com.codedifferntly.interfaces.Student;
import com.codedifferntly.interfaces.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void TestImplementation() {
        // Given
        Educator educator = Educator.TARIQ;

        // When
        boolean actual = educator instanceof Teacher;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testTeach() {
        // Given
        Educator educator = Educator.EUGENE;
        Student student = new Student(3325, "Danielle");
        educator.teach(student, 10);

        // When
        double expected = 15;
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testLecture() {
        // Given
        Educator educator = Educator.GABRIELLE;
        Student michael = new Student(1111, "Michael");
        Student sam = new Student(1112, "Sam");
        Student victor = new Student(1113, "Victor");
        Student danielle = new Student(1114, "Danielle");
        Student[] students = {michael, sam, victor, danielle};

        educator.lecture(students, 20);

        // When
        double expected = 10;
        double actual = victor.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
