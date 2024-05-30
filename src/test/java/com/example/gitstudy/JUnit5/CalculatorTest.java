package com.example.gitstudy.JUnit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @MethodSource("numberProvider")
    @DisplayName("haqiqiy sonlar boyicha test")
    void sum(int a, int b , int excepted){

        //given
        Calculator calculator  =  new Calculator();

        //when
        int actual = calculator.sum(a, b);


        //then
        assertEquals(actual,excepted);

    }
    static Stream<Arguments> numberProvider(){
        return Stream.of(Arguments.arguments(1, 1 ,2),
                        Arguments.arguments(3,4,7)
                );

    }

    @ParameterizedTest
    @MethodSource("numberProviderForException")
    @DisplayName("Manfiy sonlar tekshirish")
    void sumExceptionTest(int a, int b){

        //given
        Calculator calculator = new Calculator();

        //when & then
        assertThrows(
                    RuntimeException.class,
                ()-> calculator.sum(a,b)
                );
    }

   static Stream<Arguments> numberProviderForException(){

        return Stream.of(
                Arguments.arguments(-12,30),
                Arguments.arguments(32,-12)
        );
   }

}