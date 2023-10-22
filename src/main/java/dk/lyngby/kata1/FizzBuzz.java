package dk.lyngby.kata1;

public class FizzBuzz {

    public String fizzBuzz(int input) {
        if(input % 3 == 0 && input % 5 == 0) return "FizzBuzz";
        if(input % 3 == 0) return "Fizz";
        if(input % 5 == 0) return "Buzz";

        return String.valueOf(input);
    }

}
