package net.claymitchell.neetcode.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchRangeTest {
    @Test
    void testDefined() {
        SearchRange sr;
        sr = new SearchRange(1, 100, 1);
        assertEquals(1, sr.guess());
        sr = new SearchRange(1, 100, 50);
        assertEquals(50, sr.guess());
        sr = new SearchRange(1, 100, 100);
        assertEquals(100, sr.guess());

    }

    @Test
    void testRandom() {
        for(int i=0; i<10; i++) {
            int start = 1;
            int end = ThreadLocalRandom.current().nextInt(start, Integer.MAX_VALUE);
            int answer = ThreadLocalRandom.current().nextInt(start, end);
            SearchRange sr = new SearchRange(start, end, answer);
            System.out.println(sr);
            assertEquals(answer, sr.guess());
        }
    }

    @Test
    void testInvalid() {
        SearchRange sr = new SearchRange(1, 0, -1);
        assertEquals(-1, sr.guess());
    }

    @Test
    void testSingle() {
        SearchRange sr = new SearchRange(1, 1, 1);
        assertEquals(1, sr.guess());
    }

    @Test
    void testFailed1() {
        int end = 2126753390;
        int answer = 1702766719;
        SearchRange sr = new SearchRange(1, end, answer);
        assertEquals(answer, sr.guess());
    }
}
