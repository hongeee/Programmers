package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MakingHamburgersTest {

  @Test
  void solution() {
    MakingHamburgers s = new MakingHamburgers();
    assertEquals(2, s.solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));
    assertEquals(0, s.solution(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2}));

    assertEquals(2, s.otherSolution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));
    assertEquals(0, s.otherSolution(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2}));
  }
}
