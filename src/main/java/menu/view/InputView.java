package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String START_GUIDE_MESSAGE = "점심 메뉴 추천을 시작합니다.";
    private static final String COACH_NAME_INPUT_GUIDE_MESSAGE = "\n코치의 이름을 입력해 주세요. (, 로 구분)";

    public void printStartGuideMessage() {
        System.out.println(START_GUIDE_MESSAGE);
    }

    public void printCoachNameInputGuideMessage() {
        System.out.println(COACH_NAME_INPUT_GUIDE_MESSAGE);
    }

    public String getInput() {
        return Console.readLine();
    }
}
