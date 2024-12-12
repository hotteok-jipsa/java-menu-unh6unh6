package menu;

public enum ExceptionMessage {
    COACH_NAME_LENGTH_INVALID_EXCEPTION("코치 이름은 2글자 이상 4글자 이하여야 합니다."),
    COACHES_NUMBER_INVALID_EXCEPTION("코치의 인원 수는 2명 이상 5명 이하여야 합니다."),
    CANT_EAT_MENUS_NUMBER_INVALID_EXCEPTION("못 먹는 메뉴의 수는 0개 이상 2개 이하여야 합니다.");

    private final String prefix = "[ERROR] ";
    public final String message;

    ExceptionMessage(String message) {
        this.message = prefix + message;
    }
}