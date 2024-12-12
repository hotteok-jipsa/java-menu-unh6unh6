package menu.view;

import java.util.List;
import menu.dto.CategoryByDayDto;
import menu.dto.CoachMenuByDayDto;

public class OutputView {

    private static final String RESULT_GUIDE_MESSAGE = "점심 메뉴 추천을 시작합니다.";
    private static final String DAY_OF_WEEK_MESSAGE_FORM = "[ 구분 | %s | %s | %s | %s | %s ]\n";
    private static final String CATEGORY_MESSAGE_FORM = "[ 카테고리 | %s | %s | %s | %s | %s ]\n";
    private static final String COACHES_MENUS_MESSAGE_FORM = "[ %s | %s | %s | %s | %s | %s ]\n";

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

    private void printCoachMenus(CoachMenuByDayDto coachMenuByDayDto) {
        System.out.printf(COACHES_MENUS_MESSAGE_FORM,
                coachMenuByDayDto.name(),
                coachMenuByDayDto.menus().get(0),
                coachMenuByDayDto.menus().get(1),
                coachMenuByDayDto.menus().get(2),
                coachMenuByDayDto.menus().get(3),
                coachMenuByDayDto.menus().get(4),
                );
    }

    private void printDayOfWeek(List<CategoryByDayDto> categoryByDayDtos) {
        System.out.printf(DAY_OF_WEEK_MESSAGE_FORM,
                categoryByDayDtos.get(0).weekOfDay(),
                categoryByDayDtos.get(1).weekOfDay(),
                categoryByDayDtos.get(2).weekOfDay(),
                categoryByDayDtos.get(3).weekOfDay(),
                categoryByDayDtos.get(4).weekOfDay());
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
