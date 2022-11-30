package com.hongeee.programmers.practice.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 문제 설명
 * 수웅이는 매달 주어진 음식을 빨리 먹는 푸드 파이트 대회를 개최합니다. 이 대회에서 선수들은 1대 1로 대결하며, 매 대결마다 음식의 종류와 양이 바뀝니다. 대결은
 * 준비된 음식들을 일렬로 배치한 뒤, 한 선수는 제일 왼쪽에 있는 음식부터 오른쪽으로, 다른 선수는 제일 오른쪽에 있는 음식부터 왼쪽으로 순서대로 먹는 방식으로 진행됩니다.
 * 중앙에는 물을 배치하고, 물을 먼저 먹는 선수가 승리하게 됩니다.
 *
 * <p>이때, 대회의 공정성을 위해 두 선수가 먹는 음식의 종류와 양이 같아야 하며, 음식을 먹는 순서도 같아야 합니다. 또한, 이번 대회부터는 칼로리가 낮은 음식을 먼저 먹을
 * 수 있게 배치하여 선수들이 음식을 더 잘 먹을 수 있게 하려고 합니다. 이번 대회를 위해 수웅이는 음식을 주문했는데, 대회의 조건을 고려하지 않고 음식을 주문하여 몇 개의
 * 음식은 대회에 사용하지 못하게 되었습니다.
 *
 * <p>예를 들어, 3가지의 음식이 준비되어 있으며, 칼로리가 적은 순서대로 1번 음식을 3개, 2번 음식을 4개, 3번 음식을 6개 준비했으며, 물을 편의상 0번 음식이라고
 * 칭한다면, 두 선수는 1번 음식 1개, 2번 음식 2개, 3번 음식 3개씩을 먹게 되므로 음식의 배치는 "1223330333221"이 됩니다. 따라서 1번 음식 1개는 대회에
 * 사용하지 못합니다.
 *
 * <p>수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때, 대회를 위한 음식의 배치를 나타내는 문자열을 return 하는
 * solution 함수를 완성해주세요.
 *
 * <p>제한사항 2 ≤ food의 길이 ≤ 9 1 ≤ food의 각 원소 ≤ 1,000 food에는 칼로리가 적은 순서대로 음식의 양이 담겨 있습니다. food[i]는 i번
 * 음식의 수입니다. food[0]은 수웅이가 준비한 물의 양이며, 항상 1입니다. 정답의 길이가 3 이상인 경우만 입력으로 주어집니다. 입출력 예 food result [1,
 * 3, 4, 6] "1223330333221" [1, 7, 1, 2] "111303111" 입출력 예 설명 입출력 예 #1
 *
 * <p>문제 예시와 같습니다. 입출력 예 #1
 *
 * <p>두 선수는 1번 음식 3개, 3번 음식 1개를 먹게 되므로 음식의 배치는 "111303111"입니다.
 */
public class FoodFightCompetition {

  public String solution(int[] food) {
    StringBuffer sb = new StringBuffer(0);

    for (int i = 1; i < food.length; i++) {
      if (food[i] <= 1) {
        continue;
      }

      for (int j = 0; j < food[i] / 2; j++) {
        sb.append(i);
      }
    }

    return sb + "0" + sb.reverse();
  }

  public String otherSolution(int[] food) {
    String answer = "0";

    for (int i = food.length - 1; i > 0; i--) {
      for (int j = 0; j < food[i] / 2; j++) {
        answer = i + answer + i;
      }
    }

    return answer;
  }

  // java 11 String.repeat 사용
//  public String otherSolution2(int[] food) {
//    StringBuilder builder = new StringBuilder();
//    for (int i=1; i<food.length; i++) {
//      int result = food[i] / 2;
//      builder.append(String.valueOf(i).repeat(result));
//    }
//    String answer = builder + "0";
//    return answer + builder.reverse();
//  }
}
