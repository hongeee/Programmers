package com.hongeee.programmers.practice.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerNotCompleteTest {

    @Test
    void solution() {
        PlayerNotComplete solution = new PlayerNotComplete();
        assertEquals("leo", solution.solution(new String[] { "leo", "kiki", "eden" }, new String[] { "eden", "kiki" }));
        assertEquals("vinko", solution.solution(new String[] { "marina", "josipa", "nikola", "vinko", "filipa" }, new String[] { "josipa", "filipa", "marina", "nikola" }));
        assertEquals("mislav", solution.solution(new String[] { "mislav", "stanko", "mislav", "ana" }, new String[] { "stanko", "ana", "mislav" }));
    }
}