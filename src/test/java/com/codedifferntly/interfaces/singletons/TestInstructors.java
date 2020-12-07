package com.codedifferntly.interfaces.singletons;

import com.codedifferntly.interfaces.Instructor;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testConstructor() {
        // Given
        Instructors instructors = Instructors.getInstance();

        // When
        int expected = 8;
        int actual = instructors.getCount();

        // Then
        // Note! Race condition. Test will fail if tested with other tests. But passes on its own.
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetArray() {
        // Given
        Instructors.getInstance().add(new Instructor(78965412, "Peesha Core"));

        // When
        Instructor[] actual = Instructors.getInstance().getArray();

        // Then
        Assert.assertTrue(actual.length > 0);
    }
}
