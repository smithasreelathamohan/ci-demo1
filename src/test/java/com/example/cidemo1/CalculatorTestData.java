package com.example.cidemo1;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class CalculatorTestData {

    public static Stream<Arguments> additionData() {
        return Stream.of(Arguments.of(10,15,25),
                Arguments.of(-7,-60,-67),
                Arguments.of(-9,8,-1),
                Arguments.of(80,-50,30),
                Arguments.of(5,8.5,4),
                Arguments.of(6,-50,-44),
                Arguments.of(5.777,8.5,14.277000000000001));
    }
    public static Stream<Arguments> subtractionData() {
        return Stream.of(Arguments.of(17,5,12),
                Arguments.of(-7,-7,0),
                Arguments.of(-5,8,-3),
                Arguments.of(-60,6,-66),
                Arguments.of(5,17,-12),
                Arguments.of(-78,-5,-73));
    }

    public static Stream<Arguments> powerData() {
        return Stream.of(Arguments.of(2,4,16),
                Arguments.of(2,0,1),
                Arguments.of(2,1,2),
                Arguments.of(2,-2,0.25));
    }

    public static Stream<Arguments> squareData() {
        return Stream.of(Arguments.of(4,16),
                Arguments.of(0,0),
                Arguments.of(1,1),
                Arguments.of(-8,64));
    }
}
