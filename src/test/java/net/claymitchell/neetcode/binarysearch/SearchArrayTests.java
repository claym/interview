package net.claymitchell.neetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchArrayTests {
    int[] case1 = new int[]{-1, 0, 3, 5, 9, 12};
    int[] case2 = new int[]{-1, 0, 3, 5, 9, 12};
    int[] case3 = new int[]{5};
    int[] case4 = new int[]{2, 5};

    @Test
    void test1() {
        SearchArray sa = new SearchArray();
        int result = sa.search(case1, 9);
        assertEquals(4, result);
    }

    @Test
    void test2() {
        SearchArray sa = new SearchArray();
        int result = sa.search(case2, 2);
        assertEquals(-1, result);
    }

    @Test
    void test3() {
        SearchArray sa = new SearchArray();
        int result = sa.search(case3, 5);
        assertEquals(0, result);
    }

    @Test
    void test4() {
        SearchArray sa = new SearchArray();
        int result = sa.search(case4, 5);
        assertEquals(1, result);
    }
}
