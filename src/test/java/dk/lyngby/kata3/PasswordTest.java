package dk.lyngby.kata3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordTest {
    private Password pass;

    @BeforeEach
    void setup() {
        pass = new Password();
    }

    @Test
    public void passwordIsValid() {
        String password = "!Abcdefghg12";
        assertEquals("Password is valid", pass.validatePassword(password).getErrorMessage());
        assert(pass.validatePassword(password).isValid());
    }

    @Test
    public void passwordHasToBeMin8InLength() {
        String password = "!A12";
        assertEquals("Password must be at least 8 characters", pass.validatePassword(password).getErrorMessage());
        assertFalse(pass.validatePassword(password).isValid());
    }

    @Test
    public void passwordHasToContainDigits() {
        String password = "!Abcdefghg";
        assertEquals("The password must contain at least 2 numbers", pass.validatePassword(password).getErrorMessage());
        assertFalse(pass.validatePassword(password).isValid());
    }

    @Test
    public void validatorShouldHandleMultipleValidationErrors(){
        String password = "!A";
        String errorMessage = "Password must be at least 8 characters\nThe password must contain at least 2 numbers";

        assertEquals(errorMessage, pass.validatePassword(password).getErrorMessage());
        assertFalse(pass.validatePassword(password).isValid());
    }

    @Test
    public void testIfPasswordContainsOneCapitolLetter() {
        String password = "!a12bcdefg";
        String errorMessage = "Password must contain at least one capital letter";

        assertEquals(errorMessage, pass.validatePassword(password).getErrorMessage());
        assertFalse(pass.validatePassword(password).isValid());
    }

    @Test
    public void testIfPasswordContainOneSpecialCharacter(){
        String password = "A12bcdefg";
        String errorMessage = "Password must contain at least one special character";

        assertEquals(errorMessage, pass.validatePassword(password).getErrorMessage());
        assertFalse(pass.validatePassword(password).isValid());
    }


}