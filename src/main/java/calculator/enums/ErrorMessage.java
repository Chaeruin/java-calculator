package calculator.enums;

public enum ErrorMessage {
    INVALID_INPUT_NONE("[ERROR] 입력 없음 에러"),
    INVALID_SEPARATOR("[ERROR] 구분자 에러");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
