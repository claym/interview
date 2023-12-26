package net.claymitchell.neetcode.graph.matrixdfs;

/**
 * Leetcode problem 695
 */
public class IslandMaxArea695 {
    int[][] grid;
    boolean[][] visited;

    /**
     * per reqs, grid will never be null and size > 0
     */
    public int maxAreaOfIsland(int[][] grid) {
        int largest = 0;
        this.grid = grid;
        // reqs
        int numOfRows = grid.length;
        int numOfCols = grid[0].length;
        this.visited = new boolean[numOfRows][numOfCols];

        // iterate through each one node. when "island" is found, dfs on it
        // run Math.max against returned val and previous largest to get final largest
        for(int r=0; r<numOfRows; r++) {
            for(int c=0; c<numOfCols; c++) {
                if(grid[r][c] == 1) {
                    int islandSize = dfs(r, c);
                    largest = Math.max(largest, islandSize);
                }
            }
        }
        return largest;
    }

    private int dfs(int row, int col) {
        // see if we are outside the range of matrix
        if(row < 0 || col < 0) {
            return 0;
        }
        if(row >= grid.length || col >= grid[0].length) {
            return 0;
        }
        // see if we've found "water"
        if(grid[row][col] == 0) {
            return 0;
        }
        // make sure we haven't processed this island before;
        if(visited[row][col]) {
            return 0;
        }

        // mark that we've processed this node
        visited[row][col] = true;
        // we know this node = 1, start summing from there
        int size = 1;
        // do dfs recursive sum from bottom up
        size += dfs(row -1, col);
        size += dfs(row+1, col);
        size += dfs(row, col-1);
        size += dfs(row, col+1);
        return size;
    }
}
