package net.claymitchell.neetcode.graph.matrixdfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IslandCountTest {

    @Test
    void defaultTest1() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        IslandCount ic = new IslandCount();
        assertEquals(1, ic.numIslands(grid));
    }

    @Test
    void defaultTest2() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        IslandCount ic = new IslandCount();
        assertEquals(3, ic.numIslands(grid));
    }

    @Test
    void noIslandTest() {
        char[][] grid = new char[][]{
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        IslandCount ic = new IslandCount();
        assertEquals(0, ic.numIslands(grid));
    }

    @Test
    void nullIslandTest() {
        char[][] grid = null;
        IslandCount ic = new IslandCount();
        assertEquals(0, ic.numIslands(grid));
        grid = new char[0][0];
        assertEquals(0, ic.numIslands(grid));
    }

}
