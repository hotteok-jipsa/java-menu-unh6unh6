package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String START_GUIDE_MESSAGE = "점심 메뉴 추천을 시작합니다.";
    private static final String COACH_NAME_INPUT_GUIDE_MESSAGE = "\n코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String CANT_EAT_MENU_INPUT_GUIDE_MESSAGE_FORM = "\n%s(이)가 못 먹는 메뉴를 입력해 주세요.";

    public void printStartGuideMessage() {
        System.out.println(START_GUIDE_MESSAGE);
    }

    public void printCoachNameInputGuideMessage() {
        System.out.println(COACH_NAME_INPUT_GUIDE_MESSAGE);
    }

    public void printCantEatMenuInputGuideMessage(String name) {
        System.out.printf(CANT_EAT_MENU_INPUT_GUIDE_MESSAGE_FORM, name);
    }

    public String getInput() {
        return Console.readLine();
    }
}
