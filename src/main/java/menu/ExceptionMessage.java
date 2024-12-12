package menu;

public enum ExceptionMessage {
    COACH_NAME_LENGTH_INVALID_EXCEPTION("코치 이름은 2글자 이상 4글자 이하여야 합니다.");

    private final String prefix = "[ERROR] ";
    public final String message;

    ExceptionMessage(String message) {
        this.message = prefix + message;
    }
}