package main;

public class FizzBuzz {
    public String parse(int number) {
        if(number == 3 || number == 6) return "Fizz";
        return String.valueOf(number);
    }
}
