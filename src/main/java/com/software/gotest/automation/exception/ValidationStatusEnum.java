package com.software.gotest.automation.exception;

enum StatusType {
    SUCCESS,
    INTERNAL_ERROR,
    SYSTEM_ERROR
}
public enum ValidationStatusEnum {
    FIELD_NOT_FOUND(StatusType.SYSTEM_ERROR),
    FIELD_VALUE_NOT_MATCH(StatusType.SYSTEM_ERROR),
    ROW_NOT_FOUND(StatusType.SYSTEM_ERROR),
    NOT_CORRECT_SCREEN(StatusType.SYSTEM_ERROR),
    USER_HAS_NO_AUTORIZATION(StatusType.SYSTEM_ERROR),
    DATA_INEXISTENT(StatusType.SYSTEM_ERROR),
    NO_MOVEMENT(StatusType.SYSTEM_ERROR),

    UNKNOWN_EXCEPTION(StatusType.INTERNAL_ERROR),

    FIELD_VALUE_MATCH(StatusType.SUCCESS);

    private boolean error;

    private StatusType statusType;

    ValidationStatusEnum(StatusType statusType) {
        this.statusType = statusType;
        switch (statusType){
            case SUCCESS:
                this.error = false;
                break;
            case SYSTEM_ERROR:
            case INTERNAL_ERROR:
                this.error = true;
        }
    }
    public boolean hasError() {
        return error;
    }

    public boolean isInternalError()
    {
        return statusType == StatusType.INTERNAL_ERROR;
    }

    public boolean isSystemError()
    {
        return statusType == StatusType.SYSTEM_ERROR;
    }

    public String getStatusType() {
        return statusType.toString();
    }
}
