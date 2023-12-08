package net.claymitchell.neetcode.queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentNoLunchTest {
    @Test
    @DisplayName("default test case")
    void test0() {
        StudentNoLunch1700 noLunch = new StudentNoLunch1700();
        int[] students = new int[] {1,1,0,0};
        int[] sandwiches = new int[] {0,1,0,1};
        assertEquals(0, noLunch.countStudents(students, sandwiches));
    }

    @Test
    void test1() {
        StudentNoLunch1700 noLunch = new StudentNoLunch1700();
        int[] students = new int[] {1,1,1,0,0,1};
        int[] sandwiches = new int[] {1,0,0,0,1,1};
        assertEquals(3, noLunch.countStudents(students, sandwiches));
    }
}
