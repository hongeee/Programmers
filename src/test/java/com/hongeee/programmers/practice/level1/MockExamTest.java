package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockExamTest {

    @Test
    void solution() {
        MockExam solution = new MockExam();
        assertArrayEquals(new int[] { 1 }, solution.solution(new int[] { 1, 2, 3, 4, 5 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, solution.solution(new int[] { 1, 3, 2, 4, 2 }));
    }
}