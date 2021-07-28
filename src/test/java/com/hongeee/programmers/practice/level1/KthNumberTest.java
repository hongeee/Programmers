package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthNumberTest {

    @Test
    void solution() {
        KthNumber solution = new KthNumber();
        assertArrayEquals(new int[] { 5, 6, 3 }, solution.solution(new int[] { 1, 5, 2, 6, 3, 7, 4 }, new int[][] { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} }));
    }
}