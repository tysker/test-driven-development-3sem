package dk.lyngby.kata2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calc = new StringCalculator();

    @Test
    void testCalculator(){
        assertEquals(0, calc.add(""));
        assertEquals(1, calc.add("1"));
        assertEquals(3, calc.add("1,2"));

    }

}