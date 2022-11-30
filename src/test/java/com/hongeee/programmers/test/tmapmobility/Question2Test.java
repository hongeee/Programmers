package com.hongeee.programmers.test.tmapmobility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question2Test {

  @Test
  void solution() {
    Question2 q = new Question2();
    assertEquals(5, q.solution(new int[] {1, 2, 6, 8}, new int[] {1, 2, 5, 7}));
    assertEquals(3, q.solution(new int[] {1, 2, 4, 2}, new int[] {1, 1, 4, 2}));
  }
}