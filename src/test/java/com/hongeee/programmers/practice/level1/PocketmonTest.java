package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PocketmonTest {

    @Test
    void solution() {
        Pocketmon solution = new Pocketmon();
        assertEquals(2, solution.solution(new int[] { 3, 1, 2, 3 }));
        assertEquals(3, solution.solution(new int[] { 3, 3, 3, 2, 2, 4 }));
        assertEquals(2, solution.solution(new int[] { 3, 3, 3, 2, 2, 2 }));
    }
}