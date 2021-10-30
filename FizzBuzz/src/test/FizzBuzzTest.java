package test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class FizzBuzzTest {
    void return1For1() {
        assertEquals("1", new FizzBuzz().parse(1));
    }
}
