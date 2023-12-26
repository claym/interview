package net.claymitchell.neetcode.graph.matrixdfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IslandMaxTest {

    @Test
    void singleIsland() {
        int[][] grid = new int[][] {
                {0,0,0}, {0,1,0}, {0,0,0}
        };
        IslandMaxArea695 ima = new IslandMaxArea695();
        assertEquals(1, ima.maxAreaOfIsland(grid));
    }

    @Test
    void defaultTest1() {
        int[][] grid = new int[][] {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        IslandMaxArea695 ima = new IslandMaxArea695();
        assertEquals(6, ima.maxAreaOfIsland(grid));
    }

    @Test
    void defaultTest2() {
        int[][] grid = new int[][] {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        IslandMaxArea695 ima = new IslandMaxArea695();
        assertEquals(0, ima.maxAreaOfIsland(grid));
    }

}
