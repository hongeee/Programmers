package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThreeMusketeersTest {

  @Test
  void solution() {
    ThreeMusketeers s = new ThreeMusketeers();
    assertEquals(2, s.solution(new int[] {-2, 3, 0, 2, -5}));
    assertEquals(5, s.solution(new int[] {-3, -2, -1, 0, 1, 2, 3}));
    assertEquals(0, s.solution(new int[] {-1, 1, -1, 1}));
  }
}
