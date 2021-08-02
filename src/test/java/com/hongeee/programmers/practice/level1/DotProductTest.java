package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DotProductTest {

    @Test
    void solution() {
        DotProduct solution = new DotProduct();
        assertEquals(3, solution.solution(new int[] { 1, 2, 3, 4 }, new int[] { -3, -1, 0, 2 }));
        assertEquals(-2, solution.solution(new int[] { -1, 0, 1 }, new int[] { 1, 0, -1 }));
    }
}