package school.lemon.changerequest.java.vehicles

import spock.lang.Specification

import static school.lemon.changerequest.java.vehicles.VehicleFactory.createAirplane

class TestAirplane extends Specification {

    def "Get/Set manufactured year"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        when:
        airplane.setManufacturedYear(2007)

        then:
        airplane.getManufacturedYear() == 2007
    }

    def "Get/Set make"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        when:
        airplane.setMake("BMW")

        then:
        airplane.getMake() == "BMW"
    }

    def "Get/Set model"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        when:
        airplane.setModel("X6")

        then:
        airplane.getModel() == "X6"
    }

    def "Get/Set maximun height"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        when:
        airplane.setMaximumHeightFeet(9000)

        then:
        airplane.getMaximumHeightFeet() == 9000
    }

    def "To String"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        expect:
        airplane.toString() == "This airplane is a 2006 Boeing 747 that can reach 7000 feet."
    }

    def "Accelerate"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        expect:
        airplane.accelerate() == "fire engines on wings"
    }

    def "Steer left"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        expect:
        airplane.steerLeft() == "lift wing flaps to turn left"
    }

    def "Steer right"() {
        given:
        def airplane = createAirplane(2006, "Boeing", "747", 7000);

        expect:
        airplane.steerRight() == "lift wing flaps to turn right"
    }

    def "Compare to greater"() {
        given:
        def airplane1 = createAirplane(2006, "Boeing", "747", 7000);
        def airplane2 = createAirplane(2006, "Boeing", "747", 8001);

        expect:
        airplane1.compareTo(airplane2) < 0
    }

    def "Compare to lower"() {
        given:
        def airplane1 = createAirplane(2006, "Boeing", "747", 7000);
        def airplane2 = createAirplane(2006, "Boeing", "747", 5999);

        expect:
        airplane1.compareTo(airplane2) > 0
    }

    def "Compare to same"() {
        expect:
        createAirplane(2006, "Boeing", "747", value1).compareTo(createAirplane(2006, "Boeing", "747", value2)) == 0

        where:
        value1 | value2
        150    | 150
        140    | 150
        150    | 140
    }

    def "Equals"() {
        expect:
        createAirplane(2006, "Boeing", "747", value1).equals(createAirplane(2011, "Boeing1", "777", value2))

        where:
        value1 | value2
        7000   | 7000
        6000   | 7000
        7000   | 6000
    }

}
