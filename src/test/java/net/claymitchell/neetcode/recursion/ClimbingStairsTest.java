package net.claymitchell.neetcode.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {

    ClimbingStairs70 cs = new ClimbingStairs70();

    @Test
    @DisplayName("One")
    /**
     * only one step!
     */
    void one() {
        assertEquals(1, cs.climbStairs(1));
    }

    @Test
    @DisplayName("Two")
    /**
     * Input: n = 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     */
    void two() {
        assertEquals(2, cs.climbStairs(2));
    }

    @Test
    @DisplayName("Three")
    /**
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     */
    void three() {
        assertEquals(3, cs.climbStairs(3));
    }

    @Test
    @DisplayName("Four")
    /**
     * Input: n = 4
     * Output: 5
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step + 1 step
     * 2. 2 steps + 2 steps
     * 3. 1 step + 1 step + 2 steps
     * 4. 1 step + 2 steps + 1 step
     * 5. 2 steps + 1 step + 1 step
     */
    void four() {
        assertEquals(5, cs.climbStairs(1));
    }

    @Test
    @DisplayName("Five")
    void five() {
        assertEquals(8, cs.climbStairs(1));
    }

}
