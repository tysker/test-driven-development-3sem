package dk.lyngby.kata3;

public class Password {


    public ValidationResult passwordValidator(String input) {
        if(!validateLength(input)) return new ValidationResult(false, "Password must be at least 8 characters long");
        return new ValidationResult(validateLength(input), "Password must be at least 8 characters long");
    }

    public boolean validateLength(String input) {
        return input.length() >= 8;
    }

    public boolean validateHssTwoDigits(String input) {
        return input.matches(".*\\d{2}.*");
    }



    public record ValidationResult(boolean valid, String message) {}
}
