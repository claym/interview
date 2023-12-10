package net.claymitchell.neetcode.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BadVersionTests {

    @Test
    void testDefined() {
        BadVersion bv;
        bv = new BadVersion(5, 4);
        assertEquals(4, bv.firstBadVersion());
        bv = new BadVersion(100, 25);
        assertEquals(25, bv.firstBadVersion());
        bv = new BadVersion(100, 26);
        assertEquals(26, bv.firstBadVersion());
        bv = new BadVersion(100, 75);
        assertEquals(75, bv.firstBadVersion());
        bv = new BadVersion(100, 76);
        assertEquals(76, bv.firstBadVersion());
        bv = new BadVersion(100, 50);
        assertEquals(50, bv.firstBadVersion());
        bv = new BadVersion(100, 1);
        assertEquals(1, bv.firstBadVersion());
        bv = new BadVersion(100, 99);
        assertEquals(99, bv.firstBadVersion());

    }



    @Test
    void testRandom() {
        for(int i=0; i<10; i++) {
            int start = 1;
            int end = ThreadLocalRandom.current().nextInt(start, Integer.MAX_VALUE);
            int answer = ThreadLocalRandom.current().nextInt(start, end-1);
            BadVersion bv = new BadVersion(end, answer);
            System.out.println(bv);
            assertEquals(answer, bv.firstBadVersion());
        }
    }

    @Test
    void testInvalid() {
        BadVersion bv = new BadVersion(0, -1);
        assertEquals(-1, bv.firstBadVersion());
    }

    @Test
    void testSingle() {
        BadVersion bv = new BadVersion(1, 1);
        assertEquals(1, bv.firstBadVersion());
    }
}
