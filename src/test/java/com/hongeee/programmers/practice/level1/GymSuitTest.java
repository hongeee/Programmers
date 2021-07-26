package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GymSuitTest {

    @Test
    void solution() {
        GymSuit solution = new GymSuit();
        assertEquals(5, solution.solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
        assertEquals(4, solution.solution(5, new int[] { 2, 4 }, new int[] { 3 }));
        assertEquals(2, solution.solution(3, new int[] { 3 }, new int[] { 1 }));
    }
}