package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTernaryTest {

    @Test
    void solution() {
        ReverseTernary solution = new ReverseTernary();
        assertEquals(7, solution.solution(45));
        assertEquals(229, solution.solution(125));
    }
}