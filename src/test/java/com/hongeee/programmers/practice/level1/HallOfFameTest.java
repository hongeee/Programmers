package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HallOfFameTest {

  @Test
  void solution() {
    HallOfFame s = new HallOfFame();
    assertArrayEquals(
        new int[] {10, 10, 10, 20, 20, 100, 100},
        s.solution(3, new int[] {10, 100, 20, 150, 1, 100, 200}));
    assertArrayEquals(
        new int[] {0, 0, 0, 0, 20, 40, 70, 70, 150, 300},
        s.solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));

    assertArrayEquals(
        new int[] {10, 10, 10, 20, 20, 100, 100},
        s.otherSolution(3, new int[] {10, 100, 20, 150, 1, 100, 200}));
    assertArrayEquals(
        new int[] {0, 0, 0, 0, 20, 40, 70, 70, 150, 300},
        s.otherSolution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
  }
}
