package com.hongeee.programmers.test.sixshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void solution() {
        Solution1 solution = new Solution1();
        assertEquals(27, solution.solution2(new int[] { 5, 1, 9, 8, 10, 5 }, 3));
        assertEquals(29, solution.solution2(new int[] { 10, 1, 10, 1, 1, 4, 3, 10 }, 6));
    }
}