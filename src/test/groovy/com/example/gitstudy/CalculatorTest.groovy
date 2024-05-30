package com.example.gitstudy

import com.example.gitstudy.JUnit5.Calculator
import spock.lang.Specification

class CalculatorTest extends Specification {

    def "sum"() {

        given:
        def calculator = new Calculator();

        when:
        def actual = calculator.sum(a, b);

        then:
        actual == excepted

        where:
        a  | b  | excepted
        10 | 2  | 12
        14 | 22 | 36
        4  | 3  | 7
        33 | 33 | 66
        43 | 4  | 47
    }

    def exception(){

        given:
        def a = -3
        def b = 3
        def cal = new Calculator()

        when:

        def actual = cal(a,b)

        then:

        thrown(RuntimeException.class)
    }
}
