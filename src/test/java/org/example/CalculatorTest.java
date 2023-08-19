package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.example.Calculator.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        double x = 2;
        double y = 3;
        double z = 5;
        double result = add(x, y);
        assertEquals(result, z);
    }

    @ParameterizedTest
    @CsvSource({"5,3,2", "6,3,3"})
    void minusTest(double x, double y, double z) {
        double result = minus(x, y);
        assertEquals(result, z);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test.csv")
    void multiplyTest(double x, double y, double z) {
        double result = multiply(x, y);
        assertEquals(result, z);
        //assertThat(result, equalTo(z));
    }

    @ParameterizedTest
    @CsvSource({"2,0", "-3,0"})
    void devideTest(double x, double y) {
        assertThrows(ArithmeticException.class, () -> devide(x, y));
    }

    @Test
    void isPositivTest() {
        assertTrue(isPositiv(4));
        assertFalse(isPositiv(-4));
    }

    @ParameterizedTest
    @CsvSource({"-1", "0", "1"})
    void absTest(double x) {
        assertThat(abs(x), greaterThanOrEqualTo(0.0));
    }
}