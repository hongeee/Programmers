package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BabblingTest {

  @Test
  void solution() {
    Babbling s = new Babbling();
    assertEquals(1, s.solution(new String[] {"aya", "yee", "u", "maa"}));
    assertEquals(2, s.solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
  }
}
