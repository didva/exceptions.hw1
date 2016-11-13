package school.lemon.changerequest.java.cafe.domain;

import java.util.Random;

public class Cafe {

    private final Random random = new Random();

    public void serve(Client client) {
        client.drinkCoffee(generateCup());
    }

    private Drink generateCup() {
        DrinkType[] drinkTypes = DrinkType.values();
        return new Drink(drinkTypes[random.nextInt(drinkTypes.length)], random.nextInt(100));
    }

}
