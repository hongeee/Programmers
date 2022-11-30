package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberPairTest {

  @Test
  void solution() {
    NumberPair s = new NumberPair();
    assertEquals("-1", s.solution("100", "2345"));
    assertEquals("0", s.solution("100", "203045"));
    assertEquals("10", s.solution("100", "123450"));
    assertEquals("321", s.solution("12321", "42531"));
    assertEquals("552", s.solution("5525", "1255"));
  }

}