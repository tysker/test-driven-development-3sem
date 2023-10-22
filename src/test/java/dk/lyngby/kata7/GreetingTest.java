package dk.lyngby.kata7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private final Greeting method = new Greeting();

    @Test
    public void testGreeting() {
        assertEquals("Hello, Bob.", method.greet("Bob"));
    }

    @Test
    public void testWhenInputIsNull() {
        assertEquals("Hello, my friend.", method.greet(null));
    }

    @Test
    public void testWhenInputIsAllUpperCase() {
        assertEquals("HELLO, JERRY!", method.greet("JERRY"));
    }

    @Test
    public void testIfInputIsArrayOfNames() {
        assertEquals("Hello, Jill and Jane.", method.greet("Jill", "Jane"));
    }

    @Test
    public void testIfInputIsArrayOfNamesWithMoreThanTwoNames() {
        assertEquals("Hello, Amy, Brian, and Charlotte.", method.greet("Amy", "Brian", "Charlotte"));
    }

    @Test
    public void testIfInputIsArrayOfNamesWithMoreThanTwoNamesAndOneIsAllUpperCase() {
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!", method.greet("Amy", "BRIAN", "Charlotte"));
    }

    @Test
    public void testIfInputIsArrayOfNamesWithMoreThanTwoNamesAndTwoAreAllUpperCase() {
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN AND JERRY!", method.greet("Amy", "BRIAN", "Charlotte", "JERRY"));
    }

    @Test
    public void testIfStringContainsComma() {
        assertEquals("Hello, Bob, Charlie, and Dianne.", method.greet("Bob", "Charlie, Dianne"));
    }

}