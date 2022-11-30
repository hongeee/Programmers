package com.hongeee.programmers.test.tmapmobility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question1Test {

  @Test
  void solution() {
    Question1 q = new Question1();
    assertEquals(19, q.solution(new int[] {5, 27, 9, 0, 31}));
    assertEquals(15, q.solution(new int[] {1, 2, 4, 8}));
    assertEquals(0, q.solution(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
  }
}