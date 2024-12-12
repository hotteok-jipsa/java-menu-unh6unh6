package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String START_GUIDE_MESSAGE = "점심 메뉴 추천을 시작합니다.";

    public void printStartGuideMessage() {
        System.out.println(START_GUIDE_MESSAGE);
    }

    public String getInput() {
        return Console.readLine();
    }
}
