package dk.lyngby.kata1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
        assertEquals("2", fizzBuzz.fizzBuzz(2));
        assertEquals("4", fizzBuzz.fizzBuzz(4));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(30));
    }

}