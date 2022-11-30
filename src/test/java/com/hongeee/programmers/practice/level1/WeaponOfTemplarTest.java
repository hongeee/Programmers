package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeaponOfTemplarTest {

  @Test
  void solution() {
    WeaponOfTemplar s = new WeaponOfTemplar();
    assertEquals(10, s.solution(5, 3, 2));
    assertEquals(21, s.solution(10, 3, 2));

    assertEquals(10, s.otherSolution(5, 3, 2));
    assertEquals(21, s.otherSolution(10, 3, 2));
  }
}