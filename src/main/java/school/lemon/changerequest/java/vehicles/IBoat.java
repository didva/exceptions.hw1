package school.lemon.changerequest.java.vehicles;

public interface IBoat extends IVehicle {

    /**
     * Is boat motorized
     * @return true if motorized, false - otherwise
     */
    boolean isMotorized();

    /**
     * Specify whether boat is motorized
     * @param motorized whether boat is motorized or not
     */
    void setMotorized(boolean motorized);

}
