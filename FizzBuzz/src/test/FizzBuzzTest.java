package test;

import main.FizzBuzz;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


@Test
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

    @DataProvider(name = "numbers")
    public static Object[][] numbersAndOutputs() {
        return new Object[][]{{1, "1"}, {2, "2"}, {4, "4"}};
    }

    @Test(dataProvider = "numbers")
    @Parameters({"input", "expectedOutput"})
    void returnStringValueForNumber(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().parse(input));
    }

    @Test
    void returnFizzFor3() {
        assertEquals("Fizz", new FizzBuzz().parse(3));
    }

    @Test
    void returnFizzFor6() {
        assertEquals("Fizz", new FizzBuzz().parse(6));
    }

    @Test
    void returnFizzFor9() {
        assertEquals("Fizz", new FizzBuzz().parse(9));
    }
}
