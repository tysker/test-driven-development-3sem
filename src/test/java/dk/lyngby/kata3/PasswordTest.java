package dk.lyngby.kata3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    Password pass = new Password();
    String password = "abcdefg12";

    @Test
    public void passwordAtLeast8InLength() {
        assertTrue(pass.passwordValidator(password).valid());
        assertFalse(pass.passwordValidator("a").valid());
        assertEquals(pass.passwordValidator("1234567").message(), "Password must be at least 8 characters long");
    }

    @Test
    public void passwordHasAtLeast2Digits() {
        assertTrue(pass.passwordValidator(password).valid());
        assertFalse(pass.passwordValidator("abcdefgf").valid());
        assertEquals(pass.passwordValidator("hjduethrbf").message(), "Password must contain at least 2 digits");
    }

    @Test
    public void

}