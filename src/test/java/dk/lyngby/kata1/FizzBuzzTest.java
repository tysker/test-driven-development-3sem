package dk.lyngby.kata1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    @BeforeAll
    static void setUpBeforeClass() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testIfMethodReturnsString() {
        fizzBuzz.fizzBuzz(1);
    }

    @Test
    void testIfMethodReturnsFizz() {
        fizzBuzz.fizzBuzz(3);
    }

    @Test
    void testIfMethodReturnsBuzz() {
        fizzBuzz.fizzBuzz(5);
    }

    @Test
    void testIfMethodReturnsFizzBuzz() {
        fizzBuzz.fizzBuzz(15);
    }
}