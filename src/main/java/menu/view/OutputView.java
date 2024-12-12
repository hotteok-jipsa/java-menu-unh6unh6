package menu.view;

import java.util.List;
import menu.dto.CategoryByDayDto;
import menu.dto.CoachMenuByDayDto;

public class OutputView {

    private static final String RESULT_GUIDE_MESSAGE = "\n메뉴 추천 결과입니다.";
    private static final String DAY_OF_WEEK_MESSAGE_FORM = "[ 구분 | %s | %s | %s | %s | %s ]\n";
    private static final String CATEGORY_MESSAGE_FORM = "[ 카테고리 | %s | %s | %s | %s | %s ]\n";
    private static final String COACHES_MENUS_MESSAGE_FORM = "[ %s | %s | %s | %s | %s | %s ]\n";
    private static final String FINISH_MESSAGE = "추천을 완료했습니다.";

    public void printErrorMessage(Exception e) {
        System.out.println(e.getMessage());
    }

    public void printResultGuideMessage() {
        System.out.println(RESULT_GUIDE_MESSAGE);
    }

    public void printCategoryByDay(List<CategoryByDayDto> categoryByDayDtos) {
        printDayOfWeek(categoryByDayDtos);
        printCategory(categoryByDayDtos);
    }

    public void printCoachesMenus(List<CoachMenuByDayDto> coachMenuByDayDtos) {
        coachMenuByDayDtos.stream()
                .forEach(this::printCoachMenus);
    }

    public void printFinishMessage() {
        System.out.println(FINISH_MESSAGE);
    }

    private void printCoachMenus(CoachMenuByDayDto coachMenuByDayDto) {
        System.out.printf(COACHES_MENUS_MESSAGE_FORM,
                coachMenuByDayDto.name(),
                coachMenuByDayDto.menus().get(0),
                coachMenuByDayDto.menus().get(1),
                coachMenuByDayDto.menus().get(2),
                coachMenuByDayDto.menus().get(3),
                coachMenuByDayDto.menus().get(4)
        );
    }

    private void printDayOfWeek(List<CategoryByDayDto> categoryByDayDtos) {
        System.out.printf(DAY_OF_WEEK_MESSAGE_FORM,
                categoryByDayDtos.get(0).dayOfWeek(),
                categoryByDayDtos.get(1).dayOfWeek(),
                categoryByDayDtos.get(2).dayOfWeek(),
                categoryByDayDtos.get(3).dayOfWeek(),
                categoryByDayDtos.get(4).dayOfWeek());
    }

    private void printCategory(List<CategoryByDayDto> categoryByDayDtos) {
        System.out.printf(CATEGORY_MESSAGE_FORM,
                categoryByDayDtos.get(0).category(),
                categoryByDayDtos.get(1).category(),
                categoryByDayDtos.get(2).category(),
                categoryByDayDtos.get(3).category(),
                categoryByDayDtos.get(4).category());
    }
}
