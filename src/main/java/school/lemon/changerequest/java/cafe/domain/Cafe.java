package school.lemon.changerequest.java.cafe.domain;

import java.util.Random;

public class Cafe {

    private final Random random = new Random();

    public void serve(Client client) {
        client.drinkCoffee(generateCup());
    }

    private Drink generateCup() {
        return new Drink(DrinkType.getDrinkType(random.nextInt(100)), random.nextInt(100));
    }

}
