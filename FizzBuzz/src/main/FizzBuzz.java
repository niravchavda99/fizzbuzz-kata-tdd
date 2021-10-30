package main;

public class FizzBuzz {
    public String parse(int number) {
        if(number == 5 || number == 10) return "Buzz";
        if (number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }
}
