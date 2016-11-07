package school.lemon.changerequest.java.vehicles;

public interface ICar extends IVehicle, Comparable<ICar> {

    /**
     * Get car horsepower
     * @return horsepower
     */
    int getHorsepower();

    /**
     * Set car horsepower
     * @param horsepower of the car
     */
    void setHorsepower(int horsepower);

}
