package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddNegativePositiveTest {

    @Test
    void solution() {
        AddNegativePositive solution = new AddNegativePositive();
        assertEquals(9, solution.solution(new int[] { 4, 7, 12 }, new boolean[] { true, false, true }));
        assertEquals(0, solution.solution(new int[] { 1, 2, 3 }, new boolean[] { false, false, true }));
    }
}