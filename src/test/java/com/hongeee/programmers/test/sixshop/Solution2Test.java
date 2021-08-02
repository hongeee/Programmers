package com.hongeee.programmers.test.sixshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void solution() {
        Solution2 solution = new Solution2();
        assertEquals(4, solution.solution(3, new String[] { "alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110" }));
        assertEquals(3, solution.solution(3, new String[] { "alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200" }));
        assertEquals(3, solution.solution(2, new String[] { "cheries2 200", "alex111 100", "coco 150", "puyo 120" }));
    }
}