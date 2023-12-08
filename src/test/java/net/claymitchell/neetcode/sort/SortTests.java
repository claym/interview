package net.claymitchell.neetcode.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortTests {

    InsertionSort insertSorter = new InsertionSort();
    SortArrayMerge912 mergeSorter = new SortArrayMerge912();
    QuickSort quickSorter = new QuickSort();
    int[] case1 = new int[] {5,2,3,1};
    int[] case2 = new int[] {5,1,1,2,0,0};
    @Test
    void merge1() {

        int[] expected = Arrays.copyOf(case1, case1.length);
        Arrays.sort(expected);
        int[] output = mergeSorter.sortArray(case1);
        assertArrayEquals(expected, output);
    }

    @Test
    void merge2() {
        int[] expected = Arrays.copyOf(case2, case2.length);
        Arrays.sort(expected);
        int[] output = mergeSorter.sortArray(case2);
        assertArrayEquals(expected, output);
    }

    @Test
    void insert1() {
        int[] expected = Arrays.copyOf(case1, case1.length);
        Arrays.sort(expected);
        int[] output = insertSorter.sortArray(case1);
        assertArrayEquals(expected, output);
    }

    @Test
    void insert2() {
        int[] expected = Arrays.copyOf(case2, case2.length);
        Arrays.sort(expected);
        int[] output = insertSorter.sortArray(case2);
        assertArrayEquals(expected, output);
    }

    @Test
    void quick1() {
        int[] expected = Arrays.copyOf(case1, case1.length);
        Arrays.sort(expected);
        int[] output = quickSorter.sortArray(case1);
        assertArrayEquals(expected, output);
    }

    @Test
    void quick2() {
        int[] expected = Arrays.copyOf(case2, case2.length);
        Arrays.sort(expected);
        int[] output = quickSorter.sortArray(case2);
        assertArrayEquals(expected, output);
    }
}
