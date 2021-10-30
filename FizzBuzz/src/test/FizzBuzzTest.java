package test;

import main.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
//    @Test
//    public void return1For1() {
//        assertEquals("1", new FizzBuzz().parse(1));
//    }
//
//    @Test
//    public void return2For2() {
//        assertEquals("2", new FizzBuzz().parse(2));
//    }
//
//    @Test
//    public void return4For4() {
//        assertEquals("4", new FizzBuzz().parse(4));
//    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void returnStringValueForNumber(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().parse(input));
    }
}
