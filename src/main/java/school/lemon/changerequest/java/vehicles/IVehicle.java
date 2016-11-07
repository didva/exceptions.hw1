package school.lemon.changerequest.java.vehicles;

public interface IVehicle extends Steerable {

    /**
     * Get vehicle manufactured year
     * @return manufactured year
     */
    int getManufacturedYear();

    /**
     * Set vehicle manufactured year
     * @param year manufactured year
     */
    void setManufacturedYear(int year);

    /**
     * Get vehicle manufacturer
     * @return manufacturer
     */
    String getMake();

    /**
     * Set vehicle manufactured year
     * @param make manufacturer
     */
    void setMake(String make);

    /**
     * Get vehicle model
     * @return vehicle model
     */
    String getModel();

    /**
     * Set vehicle model
     * @param model of vehicle
     */
    void setModel(String model);

    /**
     * @return return string representation in the following formats
     * for cars: This car is a 1999 Toyota Corrola with 140 hp.
     * for boats: This boat is a 1980 Bayliner Extreme (with motor).
     * for airplanes: This airplane is a 1998 ABC Motors Comac that can reach 10000 feet.
     */
    String toString();

}
