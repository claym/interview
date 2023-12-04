package net.claymitchell.neetcode.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciRecursiveTest {

    FibonacciRecursive509 fibonacci = new FibonacciRecursive509();

    @Test
    @DisplayName("Fib 0")
    void zero() {
        int it = fibonacci.fib(0);
        assertEquals(0, it);
    }

    @Test
    @DisplayName("Fib 1")
    void one() {
        int it = fibonacci.fib(1);
        assertEquals(1, it);
    }

    @Test
    @DisplayName("Fib 2")
    void two() {
        int it = fibonacci.fib(2);
        assertEquals(1, it);
    }

    @Test
    @DisplayName("Fib 3")
    void three() {
        int it = fibonacci.fib(3);
        assertEquals(2, it);
    }

    @Test
    @DisplayName("Fib 5")
    void five() {
        int it = fibonacci.fib(5);
        assertEquals(5, it);
    }

    @Test
    @DisplayName("Fib 10")
    void ten() {
        int it = fibonacci.fib(10);
        assertEquals(55, it);
    }

    @Test
    @DisplayName("Fib 15")
    void fifteen() {
        int it = fibonacci.fib(15);
        assertEquals(610, it);
    }
}
