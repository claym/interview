package net.claymitchell.neetcode.graph.matrixbfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathTests {

    @Test
    void default1() {
        int grid[][] = new int[][]{
                {0, 1}, {1, 0}
        };
        ShortestPath1091 sp = new ShortestPath1091();
        assertEquals(2, sp.shortestPathBinaryMatrix(grid));
    }

    @Test
    void default2() {
        int grid[][] = new int[][]{
                {0,0,0},{1,1,0},{1,1,0}
        };
        ShortestPath1091 sp = new ShortestPath1091();
        assertEquals(4, sp.shortestPathBinaryMatrix(grid));
    }

    @Test
    void default3() {
        int grid[][] = new int[][]{
                {1,0,0},{1,1,0},{1,1,0}
        };
        ShortestPath1091 sp = new ShortestPath1091();
        assertEquals(-1, sp.shortestPathBinaryMatrix(grid));
    }
}
