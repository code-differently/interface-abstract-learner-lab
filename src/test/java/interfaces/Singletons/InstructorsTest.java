package interfaces.Singletons;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void testConstructor() {
        Instructors instructors = Instructors.getInstance();
        int expected = 8;
        int actual = instructors.getCount();

        Assert.assertEquals(expected, actual);
    }
}
