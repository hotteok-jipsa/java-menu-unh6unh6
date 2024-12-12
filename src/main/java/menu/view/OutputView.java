package menu.view;

public class OutputView {

    private static final String RESULT_GUIDE_MESSAGE = "점심 메뉴 추천을 시작합니다.";

    public void printErrorMessage(Exception e) {
        System.out.println(e.getMessage());
    }

    public void printResultGuideMessage() {
        System.out.println(RESULT_GUIDE_MESSAGE);
    }
}
