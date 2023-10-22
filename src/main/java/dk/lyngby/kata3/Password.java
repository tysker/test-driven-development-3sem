package dk.lyngby.kata3;

public class Password {

    private static final String PASSWORD_LENGTH_ERROR = "Password must be at least 8 characters long";
    private static final String PASSWORD_DIGIT_ERROR = "The password must contain at least 2 digits";


    public String passwordValidator(String input) {
        return "";
    }

    public boolean validateLength(String input) {
        return input.length() >= 8;
    }

    public boolean validateHasTwoDigits(String input) {
        return input.matches(".*\\d{2}.*");
    }
}
