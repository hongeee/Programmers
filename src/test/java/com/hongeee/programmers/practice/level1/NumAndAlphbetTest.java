package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumAndAlphbetTest {

    @Test
    void solution() {
        NumAndAlphbet solution = new NumAndAlphbet();
        assertEquals(1478, solution.solution("one4seveneight"));
        assertEquals(234567, solution.solution("23four5six7"));
        assertEquals(234567, solution.solution("2three45sixseven"));
        assertEquals(123, solution.solution("123"));
    }
}