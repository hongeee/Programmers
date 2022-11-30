package com.hongeee.programmers.practice.level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FoodFightCompetitionTest {

  @Test
  void solution() {
    FoodFightCompetition s = new FoodFightCompetition();
    assertEquals("1223330333221", s.solution(new int[] {1, 3, 4, 6}));
    assertEquals("111303111", s.solution(new int[] {1, 7, 1, 2}));
  }
}