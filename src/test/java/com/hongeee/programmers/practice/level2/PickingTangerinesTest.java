package com.hongeee.programmers.practice.level2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PickingTangerinesTest {

  @Test
  void solution() {
    PickingTangerines s = new PickingTangerines();
    assertEquals(3, s.solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
    assertEquals(2, s.solution(4, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
    assertEquals(1, s.solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3}));
  }
}
