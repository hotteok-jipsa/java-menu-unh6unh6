package menu.enums;

public enum Category {
    CATEGORY1("일식", 1),
    CATEGORY2("한식", 2),
    CATEGORY3("중식", 3),
    CATEGORY4("아시안", 4),
    CATEGORY5("양식", 5);

    Category(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static Category of(int number) {
        for (Category category : Category.values()) {
            if (number == category.number) {
                return category;
            }
        }
        throw new IllegalStateException();
    }

    String name;

    int number;

    public String getName() {
        return name;
    }
}
