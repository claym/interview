package net.claymitchell.neetcode.graph.matrixdfs;

/**
 * Approach: We don't care about size or anything other than count, so we will iterate through each element, and when
 * finding a "1" or "island", we will then dp a depth first search for all attached (up/down/left/right) elements, and
 * zero them out, so that once the DFS for the original is complete, we won't initiate it for any elements that are
 * attached to it
 */
public class IslandCount {


    public int numIslands(char[][] grid) {
        int count = 0;
        // base case: no grid, no islands
        if(grid == null || grid.length == 0) {
            return count;
        }

        int numOfRows = grid.length;
        int numOfCols = grid[0].length;
        for(int r = 0; r<numOfRows; r++) {
            for(int c=0; c<numOfCols; c++) {
                int val = grid[r][c];
                if(val == '1') {
                    dfs(grid, r, c);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int r, int c) {
        int numOfRows = grid.length;
        int numOfCols = grid[0].length;
        // check for base and literal edge cases
        if(r < 0 || c < 0 || r>=numOfRows || c>=numOfCols) {
            // outside borders
            return;
        }
        if(grid[r][c] == '0') {
            // this is "water"
            return;
        }

        // set current node to zero so it doesn't get counted again
        grid[r][c] = '0';
        dfs(grid, r -1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);

    }
}
