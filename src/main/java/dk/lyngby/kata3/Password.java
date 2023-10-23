package dk.lyngby.kata3;

public class Password {

    public ValidationResult validatePassword(String input) {
        String errorMessage = "";
        boolean isValid = true;

        if(input.length() < 8) {
            errorMessage += "Password must be at least 8 characters\n";
            isValid = false;
        }

        if(!input.matches(".*\\d.*\\d.*")) {
            errorMessage += "The password must contain at least 2 numbers\n";
            isValid = false;
        }

        if(!input.matches(".*[A-Z].*")) {
            errorMessage += "Password must contain at least one capital letter\n";
            isValid = false;
        }

        if(!input.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            errorMessage += "Password must contain at least one special character\n";
            isValid = false;
        }

        if(!isValid)
            return new ValidationResult(isValid, errorMessage.trim());
        else
            return new ValidationResult(isValid, "Password is valid");
    }
}
