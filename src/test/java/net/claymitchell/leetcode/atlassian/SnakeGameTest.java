package net.claymitchell.leetcode.atlassian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakeGameTest {

    @Test
    void test1() {
        int[][] food = new int[][]{{1,2}, {0,1}};
        SnakeGame353 snakeGame = new SnakeGame353(3, 2, food);
        assertEquals(0,snakeGame.move("R")); // return 0
        assertEquals(0,snakeGame.move("D")); // return 0
        assertEquals(1,snakeGame.move("R")); // return 1, snake eats the first piece of food. The second piece of food appears at (0, 1).
        assertEquals(1,snakeGame.move("U")); // return 1
        assertEquals(2,snakeGame.move("L")); // return 2, snake eats the second piece of food. no more food
        assertEquals(-1,snakeGame.move("U")); // return -1, game over, snake hits edge;
    }

    @Test
    void test2() {
        int[][] food = new int[][] {{2,0},{0,0},{0,2},{0,1},{2,2},{0,1}};
        SnakeGame353 snakeGame = new SnakeGame353(3, 3, food);
        assertEquals(0,snakeGame.move("D"));
        assertEquals(1,snakeGame.move("D"));
        assertEquals(1,snakeGame.move("R"));
        assertEquals(1,snakeGame.move("U"));
        assertEquals(1,snakeGame.move("U"));
        assertEquals(2,snakeGame.move("L"));
        assertEquals(2,snakeGame.move("D"));
        assertEquals(2,snakeGame.move("R"));
        assertEquals(2,snakeGame.move("R"));
        assertEquals(3,snakeGame.move("U"));
        assertEquals(4,snakeGame.move("L"));
        assertEquals(4,snakeGame.move("L"));
        assertEquals(4,snakeGame.move("D"));
        assertEquals(4,snakeGame.move("R"));
        assertEquals(-1,snakeGame.move("U"));

    }
}
