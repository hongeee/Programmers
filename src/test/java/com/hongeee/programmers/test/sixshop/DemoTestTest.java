package com.hongeee.programmers.test.sixshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTestTest {

    @Test
    void solution() {
        DemoTest solution = new DemoTest();
        assertArrayEquals(new int[] { 1, 10 }, solution.solution(new int[][] { { 1, 4 }, { 3, 4 }, { 3, 10 } }));
        assertArrayEquals(new int[] { 2, 1 }, solution.solution(new int[][] { { 1, 1 }, { 2, 2 }, { 1, 2 } }));
    }
}