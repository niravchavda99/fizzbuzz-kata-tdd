package test;

import main.FizzBuzz;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class FizzBuzzTest {
    public void return1For1() {
        assertEquals("1", new FizzBuzz().parse(1));
    }
}
