package school.lemon.changerequest.java.cafe.domain;

public enum DrinkType {

    TEA(0, 49),
    COFFEE(50, 99);

    private int min;
    private int max;

    DrinkType(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static DrinkType getDrinkType(int value) {
        for (DrinkType type : DrinkType.values()) {
            if (value >= type.min && value <= type.max) {
                return type;
            }
        }
        throw new IllegalArgumentException();
    }

}
