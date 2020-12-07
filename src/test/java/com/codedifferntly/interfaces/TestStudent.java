package com.codedifferntly.interfaces;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student student = new Student(23);
        assertThat(student, instanceOf(Student.class));
    }
}