package main;

public class FizzBuzz {
    public String parse(int number) {
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;

        if (fizz && buzz) return "FizzBuzz";
        if (fizz) return "Fizz";
        if (buzz) return "Buzz";
        return String.valueOf(number);
    }
}
