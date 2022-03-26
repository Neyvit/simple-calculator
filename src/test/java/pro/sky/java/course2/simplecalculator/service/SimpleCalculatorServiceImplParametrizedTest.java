package pro.sky.java.course2.simplecalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.simplecalculator.constants.SimpleCalculatorServiceImplTestConstants.*;

class SimpleCalculatorServiceImplParametrizedTest {
    private final SimpleCalculatorServiceImpl out = new SimpleCalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForSummingUpTest() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, DEFAULT_SUM1),
                Arguments.of(NUM_3, NUM_4, DEFAULT_SUM2),
                Arguments.of(NUM_5, NUM_6, DEFAULT_SUM3)
        );
    }

    public static Stream<Arguments> provideParamsForSubtractingTest() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, DEFAULT_DIFFERENCE1),
                Arguments.of(NUM_3, NUM_4, DEFAULT_DIFFERENCE2),
                Arguments.of(NUM_5, NUM_6, DEFAULT_DIFFERENCE3)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyingTest() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, DEFAULT_PRODUCT1),
                Arguments.of(NUM_3, NUM_4, DEFAULT_PRODUCT2),
                Arguments.of(NUM_5, NUM_6, DEFAULT_PRODUCT3)
        );
    }

    public static Stream<Arguments> provideParamsForDividingTest() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, DEFAULT_QUOTIENT1),
                Arguments.of(NUM_3, NUM_4, DEFAULT_QUOTIENT2),
                Arguments.of(NUM_5, NUM_6, DEFAULT_QUOTIENT3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSummingUpTest")
    public void shouldSumUpNumbers(int num1, int num2, int expectedSum) {
        int result = out.sumUpNumbers(num1, num2);
        Assertions.assertEquals(expectedSum,result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractingTest")
    public void shouldSubtractNumbers(int num1, int num2, int expectedDifference) {
        int result = out.subtractNumbers(num1, num2);
        Assertions.assertEquals(expectedDifference,result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyingTest")
    void shouldMultiplyNumbers(int num1, int num2, int expectedProduct) {
        int result = out.multiplyNumbers(num1, num2);
        Assertions.assertEquals(expectedProduct,result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDividingTest")
    void divideNumbers(int num1, int num2, int expectedQuotient) {
        int result = out.divideNumbers(num1, num2);
        Assertions.assertEquals(expectedQuotient,result);
    }
}