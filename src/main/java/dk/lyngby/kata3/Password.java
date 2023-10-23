package dk.lyngby.kata3;

public class Password {
    public String validatePassword(String input) {
        if(input.length() < 8) return "Password must be at least 8 characters";
        if(!input.matches(".*\\d.*\\d.*")) return "The password must contain at least 2 numbers";
        return input;

    }
}
