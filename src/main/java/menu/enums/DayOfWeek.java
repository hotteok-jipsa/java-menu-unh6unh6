package menu.enums;

public enum DayOfWeek {
    MON("월요일"),
    TUE("화요일"),
    WED("수요일"),
    THU("목요일"),
    FRI("금요일");

    DayOfWeek(String name) {
        this.name = name;
    }

    String name;
}
