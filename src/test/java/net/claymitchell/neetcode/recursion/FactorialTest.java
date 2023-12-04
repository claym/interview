package net.claymitchell.neetcode.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    @DisplayName("one")
    void one() {
        assertEquals(1, Factorial.calculateFactorial(1));
    }

    @Test
    @DisplayName("two")
    void two() {
        assertEquals(2, Factorial.calculateFactorial(2));
    }

    @Test
    @DisplayName("five")
    void five() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    @DisplayName("zero")
    void zero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

}
