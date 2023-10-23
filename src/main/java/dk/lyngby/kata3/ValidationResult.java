package dk.lyngby.kata3;

import lombok.Getter;

@Getter
public class ValidationResult {

    private boolean isValid;
    private String errorMessage;

    public ValidationResult(boolean isValid, String errorMessage) {
        this.errorMessage = errorMessage;
        this.isValid = isValid;
    }
}
