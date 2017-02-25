package school.lemon.changerequest.java.cafe.domain;

import school.lemon.changerequest.java.cafe.exceptions.ServeException;
import school.lemon.changerequest.java.cafe.exceptions.TooColdException;
import school.lemon.changerequest.java.cafe.exceptions.TooHotException;
import school.lemon.changerequest.java.cafe.exceptions.WrongDrinkException;

import java.util.Random;

public class Client {

    public static final int LOWEST_TEMPERATURE = 30;
    public static final int HIGHEST_TEMPERATURE = 80;

    private final Random random = new Random();

    public void drinkCoffee(Drink drink) {
        if (drink.getDrinkType() != DrinkType.COFFEE) {
            System.out.println("Tastes like a " + drink.getDrinkType());
            throw new WrongDrinkException("Tastes like a " + drink.getDrinkType());
        } else if (drink.getTemperature() < LOWEST_TEMPERATURE) {
            System.out.println("Looks like it's too cold...");
            throw new TooColdException("Looks like it's too cold...");
        } else if (drink.getTemperature() > HIGHEST_TEMPERATURE) {
            System.out.println("Looks like it's too hot...");
            throw new TooHotException("Looks like it's too hot...");
        } else if (random.nextInt(100) < 10) {
            System.out.println("I don't like your Cafe!");
            throw new ServeException("I don't like your Cafe!");
        } else {
            System.out.println("Delicious, thank you.");
        }
    }

}
