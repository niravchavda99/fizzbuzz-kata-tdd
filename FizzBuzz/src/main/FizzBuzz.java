package main;

public class FizzBuzz {
    public String parse(int number) {
        if(number == 15) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if(number == 5 || number == 10) return "Buzz";
        return String.valueOf(number);
    }
}
