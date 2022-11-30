package com.hongeee.programmers.practice.level2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ColoringBookTest {

  @Test
  void solution() {
    ColoringBook s = new ColoringBook();
    assertArrayEquals(
        new int[] {4, 5},
        s.solution(
            6,
            4,
            new int[][] {
              {1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}
            }));
  }
}
