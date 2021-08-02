package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakePrimeNumberTest {

    @Test
    void solution() {
        MakePrimeNumber solution = new MakePrimeNumber();
        assertEquals(1, solution.solution(new int[] { 1, 2, 3, 4 }));
        assertEquals(4, solution.solution(new int[] { 1, 2, 7, 6, 4 }));
    }
}