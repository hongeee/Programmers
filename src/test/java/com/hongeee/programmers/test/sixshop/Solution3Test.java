package com.hongeee.programmers.test.sixshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    @Test
    void solution() {
        Solution3 solution = new Solution3();
        assertArrayEquals(new int[] { 2, 3, 1, 5, 4 }, solution.solution(3, new int[] { 4, 2, 2, 5, 3 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, solution.solution(1, new int[] { 100, 1, 50, 1, 1 }));
    }
}