package main;

public class FizzBuzz {
    public String parse(int number) {
        if (number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }
}
