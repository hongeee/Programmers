package com.hongeee.programmers.test.tmapmobility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question3Test {

  @Test
  void solution() {
    Question3 q = new Question3();
    assertArrayEquals(
        new int[][] {{1, 0, 1}, {2, 1, 2}, {3, 2, 3}}, q.solution(3, new int[][] {{1, 2}}));
    assertArrayEquals(
        new int[][] {{1, 0, 1}, {2, 1, 1}, {2, 1, 0}},
        q.solution(3, new int[][] {{1, 2}, {3, 3}}));
  }
}