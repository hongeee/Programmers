package com.hongeee.programmers.skills.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {
    @Test
    void solution() {
        Solution1 solution = new Solution1();
        assertEquals(2, solution.solution(12, new int[] { 1, 5, 6, 10 }, new int[] { 1, 2, 3, 4 }));
        assertEquals(1, solution.solution(12, new int[] { 1, 3, 4, 9, 10 }, new int[] { 3, 5, 7 }));
    }
}