package interfaces.Singletons;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void constructorTest() {
        int expected = 9;
        Students students = Students.getInstance();
        int actual = students.getCount();

        Assert.assertEquals(expected, actual);
    }
}
