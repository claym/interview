package net.claymitchell.neetcode.graph.matrixbfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static net.claymitchell.neetcode.graph.matrixbfs.BFSUtil.*;
/**
 * Leetcode Problem 1091
 * https://leetcode.com/problems/shortest-path-in-binary-matrix/
 */
public class ShortestPath1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        // base case - if starting node isn't open fail out immediately
        if(grid[0][0] == 1) {
            return -1;
        }
        int ROWS = grid.length;
        int COLS = grid[0].length;
        // created a visited tracker so we don't process nodes twice
        int[][] visited = new int[grid.length][grid[0].length];
        // queue for neighbors to process
        Deque<int[]> queue = new ArrayDeque<>();
        // add our root block (0,0) since we know we'll always start there
        queue.add(new int[2]); // cheesy way to add 0,0 to coordinates
        visited[0][0] = 1;
        // track distance
        int length = 1;
        while (!queue.isEmpty()) {
            // snapshot our current queue length
            int queueSize = queue.size();
            // start processing that number of items
            for (int i = 0; i < queueSize; i++) {
                int[] coords = queue.pop();
                // get row and column to process
                int r = coords[0], c = coords[1];
                // check to see if we're at the destination (bottom right of matrix)
                if (r == ROWS - 1 && c == COLS - 1) {
                    return length;
                }
                // ok, have a legit coordinate to process
                // get neighbors
                List<int[]> neighbors = getNeighbors(r, c, grid, true);
                // queue up all neighbors fo
                for(int[] n : neighbors) {
                    // get next set of coordinates
                    int nextR = n[0], nextC = n[1];
                    // util did all the checks, check visited and then queue em up
                    if(visited[nextR][nextC] == 1) {
                        continue;
                    }
                    queue.add(n);
                    visited[nextR][nextC] = 1;
                }
            }
            // go through one segment, increment then start queue snapshot again
            length++;
        }
        // we never hit our winning condition, return -1
        return -1;
    }
}
