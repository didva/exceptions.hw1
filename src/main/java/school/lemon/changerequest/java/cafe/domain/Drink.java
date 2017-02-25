package school.lemon.changerequest.java.cafe.domain;

public class Drink {

    private DrinkType drinkType;
    private int temperature;

    public Drink(DrinkType drinkType, int temperature) {
        this.drinkType = drinkType;
        this.temperature = temperature;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public int getTemperature() {
        return temperature;
    }

    public void warmUp() {
        temperature += 5;
    }

    public void coldDown() {
        temperature -= 5;
    }

}
