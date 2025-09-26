package com.incubyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    void emptyStringReturnsZero() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void singleNumberReturnsValue() {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    void twoNumbersCommaDelimited() {
        assertEquals(6, calculator.add("1,5"));
    }

    @Test
    void multipleNumbers() {
        assertEquals(10, calculator.add("1,2,3,4"));
    }

    @Test
    void newLinesBetweenNumbers() {
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    void customSingleCharDelimiter() {
        assertEquals(3, calculator.add("//;\n1;2"));
        assertEquals(6, calculator.add("//-\n1-2-3"));
    }

    @Test
    void negativeNumberThrowsException() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,3"));
        assertTrue(e.getMessage().contains("negative numbers not allowed -2"));
    }

    @Test
    void multipleNegativesInExceptionMessage() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,-3,4"));
        assertTrue(e.getMessage().contains("negative numbers not allowed -2,-3"));
    }
}