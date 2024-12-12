package menu.model;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import menu.enums.Category;

public class Menus {


    private static final List<String> category1Menus = List.of(
            "규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼"
    );

    private static final List<String> category2Menus = List.of(
            "김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음"
    );

    private static final List<String> category3Menus = List.of(
            "깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채"
    );

    private static final List<String> category4Menus = List.of(
            "팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜"
    );

    private static final List<String> category5Menus = List.of(
            "라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니"
    );

    public static final Map<Category, List<String>> categoryMenu = new EnumMap<>(Category.class);

    static {
        categoryMenu.put(Category.CATEGORY1, category1Menus);
        categoryMenu.put(Category.CATEGORY2, category2Menus);
        categoryMenu.put(Category.CATEGORY3, category3Menus);
        categoryMenu.put(Category.CATEGORY4, category4Menus);
        categoryMenu.put(Category.CATEGORY5, category5Menus);
    }

}
