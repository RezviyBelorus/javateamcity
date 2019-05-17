package utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void increment() {
        Math math = new Math();
        int number = 0;
        int increment = math.increment(number);

        number++;

        Assert.assertEquals(number, increment);
    }
}