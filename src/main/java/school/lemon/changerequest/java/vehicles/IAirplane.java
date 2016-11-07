package school.lemon.changerequest.java.vehicles;

public interface IAirplane extends IVehicle {

    /**
     * Get airplane maximum height
     * @return airplane maximum height
     */
    int getMaximumHeightFeet();

    /**
     * Set airplane maximum height
     * @param maximumHeightFeet maximum height of the airplane
     */
    void setMaximumHeightFeet(int maximumHeightFeet);

}
