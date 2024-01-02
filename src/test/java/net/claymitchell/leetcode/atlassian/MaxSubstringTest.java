package net.claymitchell.leetcode.atlassian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubstringTest {

    @Test
    void test1() {
        MaxSubStringOccurences1297 msso = new MaxSubStringOccurences1297();
        assertEquals(2, msso.maxFreq("aababcaab", 2, 3, 4));
    }

    @Test
    void test2() {
        MaxSubStringOccurences1297 msso = new MaxSubStringOccurences1297();
        assertEquals(2, msso.maxFreq("aaaa", 1, 3, 3));
    }
}
