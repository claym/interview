package net.claymitchell.neetcode.graph.matrixbfs;

import java.util.ArrayList;
import java.util.List;

public class BFSUtil {
    private static final int[][] allDirections =
            new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    private static final int[][] cardinalDirections =
            new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public static List<int[]> getNeighbors(int row, int col, int[][] grid, boolean allowDiagonal) {
        int[][] directions = cardinalDirections;
        if(allowDiagonal) {
            directions = allDirections;
        }
        List<int[]> neighbours = new ArrayList<>();
        for (int[] direction : directions) {
            // get coordinates
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            // make sure coordinates are not outside bounds of grid
            if (newRow < 0 || newCol < 0 || newRow >= grid.length
                    || newCol >= grid[0].length
                    || grid[newRow][newCol] != 0) {
                continue;
            }
            neighbours.add(new int[]{newRow, newCol});
        }
        return neighbours;
    }
}
