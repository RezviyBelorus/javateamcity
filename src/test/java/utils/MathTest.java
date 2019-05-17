package utils;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

    @Test
    public void increment() {
        Math math = new Math();
        int number = 0;
        int increment = math.increment(number);

        number += 2;

        Assert.assertEquals(number, increment);
    }
}