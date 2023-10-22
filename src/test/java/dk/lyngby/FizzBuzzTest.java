package dk.lyngby;

import dk.lyngby.kata1.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
        assertEquals("2", fizzBuzz.fizzBuzz(2));
        assertEquals("7", fizzBuzz.fizzBuzz(7));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(30));
    }


}