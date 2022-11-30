package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FruitSellerTest {

  @Test
  void solution() {
    FruitSeller s = new FruitSeller();
    assertEquals(8, s.solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1}));
    assertEquals(33, s.solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    assertEquals(8, s.otherSolution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1}));
    assertEquals(33, s.otherSolution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
  }
}
