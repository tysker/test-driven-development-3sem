package dk.lyngby.kata3;

import lombok.Getter;

@Getter
public class ValidationResult {

    private String errorMessage;
    private boolean isValid;

    public ValidationResult(String errorMessage, boolean isValid) {
        this.errorMessage = errorMessage;
        this.isValid = isValid;
    }
}
