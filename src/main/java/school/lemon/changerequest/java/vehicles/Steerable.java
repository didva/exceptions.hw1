package school.lemon.changerequest.java.vehicles;

public interface Steerable {

    /**
     * @return for cars: "fire pistons, turn wheels"
     * for boats: "jet water"
     * for airplanes: "fire engines on wings"
     */
    String accelerate();

    /**
     * @return for cars: "turn wheels left"
     * for boats: "turn tiller left"
     * for airplanes: "lift wing flaps to turn left"
     */
    String steerLeft();

    /**
     * @return for cars: "turn wheels right"
     * for boats: "turn tiller right"
     * for airplanes: "lift wing flaps to turn right"
     */
    String steerRight();

}
