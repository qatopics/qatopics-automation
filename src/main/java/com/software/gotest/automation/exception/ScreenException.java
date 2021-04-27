package com.software.gotest.automation.exception;

public class ScreenException extends Exception {
    private final ValidationStatusEnum validationStatusEnum;

    public ScreenException(String message, ValidationStatusEnum validationStatusEnum) {
        super(message);
        this.validationStatusEnum = validationStatusEnum;
    }

    public ScreenException(String message, Throwable cause, ValidationStatusEnum validationStatus) {
        super(message, cause);
        this.validationStatusEnum = validationStatus;
    }

    public ValidationStatusEnum getValidationStatusEnum() {
        return validationStatusEnum;
    }
}
