package school.lemon.changerequest.java.cafe.domain;

import school.lemon.changerequest.java.cafe.exceptions.TooColdException;
import school.lemon.changerequest.java.cafe.exceptions.TooHotException;
import school.lemon.changerequest.java.cafe.exceptions.WrongDrinkException;

import java.util.Random;

public class Cafe {

    private final Random random = new Random();

    public void serve(Client client) {
        Drink drink = generateCup();
        while (true) {
            try {
                client.drinkCoffee(drink);
            } catch (TooColdException ex) {
                drink.warmUp();
            } catch (TooHotException ex) {
                drink.coldDown();
            } catch (WrongDrinkException ex) {
                drink = generateCup();
            }
        }
    }

    private Drink generateCup() {
        DrinkType[] drinkTypes = DrinkType.values();
        return new Drink(drinkTypes[random.nextInt(drinkTypes.length)], random.nextInt(100));
    }

}
