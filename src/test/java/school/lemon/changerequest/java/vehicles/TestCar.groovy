package school.lemon.changerequest.java.vehicles

import spock.lang.Specification

import static school.lemon.changerequest.java.vehicles.VehicleFactory.createCar

class TestCar extends Specification {

    def "Get/Set manufactured year"() {
        given:
        def car = createCar(2006, "Audi", "TT", 150)

        when:
        car.setManufacturedYear(2007)

        then:
        car.getManufacturedYear() == 2007
    }

    def "Get/Set make"() {
        given:
        def car = createCar(2006, "Audi", "TT", 150)

        when:
        car.setMake("BMW")

        then:
        car.getMake() == "BMW"
    }

    def "Get/Set model"() {
        given:
        def car = createCar(2006, "Audi", "TT", 150)

        when:
        car.setModel("X6")

        then:
        car.getModel() == "X6"
    }

    def "Get/Set horsepower"() {
        given:
        def car = createCar(2006, "Audi", "TT", 150)

        when:
        car.setHorsepower(175)

        then:
        car.getHorsepower() == 175
    }

    def "To String"() {
        given:
        def car = createCar(2006, "Audi", "TT", 150)

        expect:
        car.toString() == "This car is a 2006 Audi TT with 150 hp."
    }

    def "Accelerate"() {
        given:
        def car = createCar(2006, "Audi", "TT", 150)

        expect:
        car.accelerate() == "fire pistons, turn wheels"
    }

    def "Steer left"() {
        given:
        def car = createCar(2006, "Audi", "TT", 150)

        expect:
        car.steerLeft() == "turn wheels left"
    }

    def "Steer right"() {
        given:
        def car = createCar(2006, "Audi", "TT", 150)

        expect:
        car.steerRight() == "turn wheels right"
    }

    def "Equals"() {
        expect:
        createCar(2016, "Bmw", "X6", value1).equals(createCar(2006, "Audi", "TT", value2))

        where:
        value1 | value2
        150    | 150
        140    | 150
        150    | 140
    }

}
