package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonalityTypeTestTest {

  @Test
  void solution() {
    PersonalityTypeTest s = new PersonalityTypeTest();
    assertEquals(
        "TCMA", s.solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5}));
    assertEquals("RCJA", s.solution(new String[] {"TR", "RT", "TR"}, new int[] {7, 1, 3}));
  }
}
