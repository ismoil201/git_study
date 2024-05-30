package com.example.gitstudy.Mission

import org.junit.jupiter.api.Test
import spock.lang.Specification

class JUnit_SpockTestGroovy extends Specification {

    def "filter"(){

        given:
        def filter =  new JUnit_Spock()
        def list  = []
        for(int i = 0; i<100; i++)
            list.add(i+1)

        def from = 10
        def to = 20
        def exceptedSize =  to - from -1

        when:
        def actual = filter.filterBy(list,from, to)

        then:
        exceptedSize == actual.size()
    }

    def "exception"(){

        given:
        def filter =  new JUnit_Spock()
        def list  = []
        for(int i = 0; i<100; i++)
            list.add(i+1)

        def from = 20
        def to = 10
        def exceptedSize =  to - from -1

        when:
        def actual = filter.filterBy(list,from, to)

        then:
        def error = thrown(RuntimeException.class)

        error.getMessage() == "from  20 ga qaraganda to 10  kichkina !!! "
    }
}
