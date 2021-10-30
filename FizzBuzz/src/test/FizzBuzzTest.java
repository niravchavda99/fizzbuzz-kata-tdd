package test;

import main.FizzBuzz;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


@Test
public class FizzBuzzTest {

    @DataProvider(name = "baseNumbers")
    public static Object[][] baseNumbers() {
        return new Object[][]{{1, "1"}, {2, "2"}, {4, "4"}, {7, "7"}, {8, "8"}, {11, "11"}, {13, "13"}, {14, "14"}};
    }

    @DataProvider(name = "fizzNumbers")
    public static Object[] fizzNumbers() {
        return new Object[]{3, 6, 9};
    }

    @Test(dataProvider = "baseNumbers")
    @Parameters({"input", "expectedOutput"})
    void returnStringValueForNumber(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().parse(input));
    }

    @Test(dataProvider = "fizzNumbers")
    @Parameters({"input"})
    void returnFizzForMultiplesOf3(int input) {
        assertEquals("Fizz", new FizzBuzz().parse(input));
    }

    @Test
    void returnBuzzFor5() {
        assertEquals("Buzz", new FizzBuzz().parse(5));
    }

    @Test
    void returnBuzzFor10() {
        assertEquals("Buzz", new FizzBuzz().parse(10));
    }

    @Test
    void returnFizzBuzzFor15() {
        assertEquals("FizzBuzz", new FizzBuzz().parse(15));
    }
}
