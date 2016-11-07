package school.lemon.changerequest.java.vehicles

import spock.lang.Specification

class TestBoat extends Specification {

    def "Get/Set manufactured year"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        when:
        boat.setManufacturedYear(2007)

        then:
        boat.getManufacturedYear() == 2007
    }

    def "Get/Set make"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        when:
        boat.setMake("BMW")

        then:
        boat.getMake() == "BMW"
    }

    def "Get/Set model"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        when:
        boat.setModel("X6")

        then:
        boat.getModel() == "X6"
    }

    def "Is motorized"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        when:
        boat.setMotorized(false)

        then:
        !boat.isMotorized()
    }

    def "To String with motor"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        expect:
        boat.toString() == "This boat is a 1980 Bayliner Extreme (with motor)."
    }

    def "To String without motor"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", false);

        expect:
        boat.toString() == "This boat is a 1980 Bayliner Extreme."
    }

    def "Accelerate"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        expect:
        boat.accelerate() == "jet water"
    }

    def "Steer left"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        expect:
        boat.steerLeft() == "turn tiller left"
    }

    def "Steer right"() {
        given:
        def boat = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        expect:
        boat.steerRight() == "turn tiller right"
    }

    def "Compare to greater"() {
        given:
        def boat1 = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", false);
        def boat2 = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        expect:
        boat1.compareTo(boat2) < 0
    }

    def "Compare to lower"() {
        given:
        def boat1 = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);
        def boat2 = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", false);

        expect:
        boat1.compareTo(boat2) > 0
    }

    def "Compare to same"() {
        given:
        def boat1 = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);
        def boat2 = VehicleFactory.createBoat(1980, "Bayliner", "Extreme", true);

        expect:
        boat1.compareTo(boat2) == 0
    }

}
