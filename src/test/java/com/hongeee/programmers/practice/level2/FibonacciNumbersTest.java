package com.hongeee.programmers.practice.level2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciNumbersTest {

  @Test
  void solution() {
    FibonacciNumbers s = new FibonacciNumbers();
    assertEquals(2, s.solution(3));
    assertEquals(5, s.solution(5));
  }
}