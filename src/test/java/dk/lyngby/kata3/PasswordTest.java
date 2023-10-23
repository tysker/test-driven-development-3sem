package dk.lyngby.kata3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordTest {
    //boolean match = str.matches(".*\\d.*\\d.*");
    Password pass = new Password();

    @Test
    public void passwordHasToBeMin8InLength() {
        assertEquals("Password must be at least 8 characters", pass.validatePassword("abcdefg"));
    }

    @Test
    public void passwordHasToContainDigits() {
        assertEquals("The password must contain at least 2 numbers", pass.validatePassword("abcdefghg"));
    }


}