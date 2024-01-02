package net.claymitchell.leetcode.atlassian;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SnakeGame353 {
    Deque<int[]> snake;
    Deque<int[]> food;
    int score;
    int height;
    int width;
    public SnakeGame353(int width, int height, int[][] food) {
        // create a FIFO queue to maintain snake state
        snake = new ArrayDeque<>();
        snake.push(new int[] {0,0});
        this.food = new ArrayDeque<>();
        this.food.addAll(Arrays.asList(food));
        this.height = height;
        this.width = width;
        this.score = 0;
    }

    public int move(String direction) {
        int[] head = snake.peekLast();
        int[] tail = snake.pop();
        assert head != null;
        int headRow = head[0];
        int headCol = head[1];
        switch(direction) {
            case "U":
                headRow--;
                break;
            case "D":
                headRow++;
                break;
            case "L":
                headCol--;
                break;
            case "R":
                headCol++;
                break;
        }

        // base cases: exceeded grid limits
        if(headCol < 0 || headCol >= width) {
            return -1;
        }
        if(headRow < 0 || headRow >= height) {
            return -1;
        }
        if(snake.size() > height * width) {
            return -1;
        }
        int[] position = new int[] {headRow, headCol};

        // see if the new space is food - we can't run into ourselves if it's food.
        if(Arrays.equals(position, food.peek())) {
            score++;
            // put the tail back in as we are growing, not moving
            snake.addFirst(tail);
            // add the new head
            snake.addLast(position);

            food.remove();
            return score;
        }
        // check to see if we run into ourselves. has to be over 4 to do that.
        if(snake.stream().anyMatch(a -> Arrays.equals(a, position))) {
            return -1;
        }
        // we haven't failed or grown, add new head.
        snake.addLast(position);

        return score;

    }
}
