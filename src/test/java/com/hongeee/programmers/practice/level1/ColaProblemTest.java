package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColaProblemTest {

  @Test
  void solution() {
    ColaProblem s = new ColaProblem();
    assertEquals(19, s.solution(2, 1, 20));
    assertEquals(9, s.solution(3, 1, 20));
  }

}