package dk.lyngby.kata3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    Password pass = new Password();

    @Test
    public void testPasswordValidator() {

        assertTrue(pass.passwordValidator("12345678").valid());
        assertEquals(pass.passwordValidator("12345678").message(), "Password must be at least 8 characters long");

    }

}