package school.lemon.changerequest.java.extendedinteger

import spock.lang.Specification
import spock.lang.Unroll

class TestExtendedInteger extends Specification {

    @Unroll
    def "Static is even #value"() {
        expect:
        ExtendedInteger.isEven(value) == isEven

        where:
        value | isEven
        -2    | true
        -1    | false
        0     | true
        1     | false
        2     | true
    }

    @Unroll
    def "Static is odd #value"() {
        expect:
        ExtendedInteger.isOdd(value) == isOdd

        where:
        value | isOdd
        -2    | false
        -1    | true
        0     | false
        1     | true
        2     | false
    }

    @Unroll
    def "Static is prime #value"() {
        expect:
        ExtendedInteger.isPrime(value) == isOdd

        where:
        value | isOdd
        -1    | false
        0     | false
        1     | false
        2     | true
        3     | true
        4     | false
        5     | true
        7     | true
        21    | false
    }

    @Unroll
    def "Parse int from char array: #intValue"() {
        expect:
        ExtendedInteger.parseInt(valueToParse.toCharArray()).getValue() == intValue

        where:
        valueToParse | intValue
        "-123"       | -123
        "-12"        | -12
        "-1"         | -1
        "0"          | 0
        "1"          | 1
        "12"         | 12
        "123"        | 123
    }

    @Unroll
    def "Parse int from string: #intValue"() {
        expect:
        ExtendedInteger.parseInt(valueToParse).getValue() == intValue

        where:
        valueToParse | intValue
        "-123"       | -123
        "-12"        | -12
        "-1"         | -1
        "0"          | 0
        "1"          | 1
        "12"         | 12
        "123"        | 123
    }

    @Unroll
    def "Is even #value"() {
        given:
        def extendedInteger = new ExtendedInteger(value)

        expect:
        extendedInteger.isEven() == isEven

        where:
        value | isEven
        -2    | true
        -1    | false
        0     | true
        1     | false
        2     | true
    }

    @Unroll
    def "Is odd #value"() {
        given:
        def extendedInteger = new ExtendedInteger(value)

        expect:
        extendedInteger.isOdd() == isOdd

        where:
        value | isOdd
        -2    | false
        -1    | true
        0     | false
        1     | true
        2     | false
    }

    @Unroll
    def "Is prime #value"() {
        given:
        def extendedInteger = new ExtendedInteger(value)

        expect:
        extendedInteger.isPrime() == isOdd

        where:
        value | isOdd
        -1    | false
        0     | false
        1     | false
        2     | true
        3     | true
        4     | false
        5     | true
        7     | true
        21    | false
    }

    @Unroll
    def "Is equals to int #value"() {
        given:
        def extendedInteger = new ExtendedInteger(10)

        expect:
        extendedInteger.equals(value) == isEquals

        where:
        value | isEquals
        -1    | false
        0     | false
        10    | true
    }

    @Unroll
    def "Is equals to ExtendedInteger #value"() {
        given:
        def extendedInteger = new ExtendedInteger(10)

        expect:
        extendedInteger.equals(value) == isEquals

        where:
        value                   | isEquals
        new ExtendedInteger(-1) | false
        new ExtendedInteger(0)  | false
        new ExtendedInteger(10) | true
        null                    | false
        new Object()            | false
    }

    @Unroll
    def "Parse invalid int from char array: #valueToParse"() {
        when:
        ExtendedInteger.parseInt(valueToParse.toCharArray())

        then:
        thrown(NumberFormatException)

        where:
        valueToParse | _
        "-12.3"      | _
        "-12a"       | _
        "a-1"        | _
        "asd"        | _
        ""           | _
    }

    @Unroll
    def "Parse invalid int from string: #valueToParse"() {
        when:
        ExtendedInteger.parseInt(valueToParse)

        then:
        thrown(NumberFormatException)

        where:
        valueToParse | _
        "-12.3"      | _
        "-12a"       | _
        "a-1"        | _
        "asd"        | _
        ""           | _
    }

    @Unroll
    def "Parse int from null char array"() {
        when:
        ExtendedInteger.parseInt((char[]) null)

        then:
        thrown(NullPointerException)
    }

    @Unroll
    def "Parse int from null string"() {
        when:
        ExtendedInteger.parseInt((String) null)

        then:
        thrown(NullPointerException)
    }
}
