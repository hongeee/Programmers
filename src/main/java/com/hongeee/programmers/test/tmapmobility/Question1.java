package com.hongeee.programmers.test.tmapmobility;

/**
 * 정수 배열 numbers [numbers[0], numbers[1], ..., numbers[n-1]] 이 주어집니다.
 * numbers[0]의 0번째 비트, numbers[1]의 1번째 비트, ..., numbers[n-1]의 (n-1)번째 비트를 각각 뽑아서 합친 새로운 정수를 return 하도록 solution 함수를 완성해주세요.
 * 단, 0부터 n-1번째까지의 비트를 제외한 나머지 모든 비트는 0으로 설정해야 하며, 비트의 순서는 제일 낮은 위치에 있는 비트를 0번째로 셉니다.
 *
 * 제한사항
 * - numbers의 길이는 1 이상 31 이하입니다.
 * - numbers의 모든 원소는 0 이상 2,147,483,647 이하인 정수입니다.
 *
 * 입출력 예
 * numbers  result
 * [5,27,9,0,31]  19
 * [1,2,4,8]  15
 * [0,0,0,0,0,0,0,0,0,0]  0
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * - 주어진 문제를 푸는 과정을 표로 나타내면 다음과 같습니다.
 * i  numbers[i]  2진법으로 변환  i번째 비트
 * 0  5   00101   ....1
 * 1  27  11011   ...1.
 * 2  9   01001   ..0..
 * 3  0   00000   .0...
 * 4  31  11111   1....
 * -  -   -       10011
 * - 10011은 10진법으로 19이므로, 19를 return 해야 합니다.
 *
 * 입출력 예 #2
 * - 주어진 문제를 푸는 과정을 표로 나타내면 다음과 같습니다.
 * i  numbers[i]  2진법으로 변환  i번째 비트
 * 0  1   0001  ...1
 * 1  2   0010  ..1.
 * 2  4   0100  .1..
 * 3  8   1000  1...
 * -  -   -     1111
 * - 1111은 10진법으로 15이므로, 15를 return 해야 합니다.
 *
 * 입출력 예 #3
 * - 0은 모든 비트가 0이고, numbers의 모든 수가 0이므로, numbers의 각 숫자로부터 비트를 하나씩 뽑아서 만든 수도 0입니다.
 */
public class Question1 {

  public int solution(int[] numbers) {
    String s = "0".repeat(numbers.length);
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < numbers.length; i++) {
      String bin = Integer.toBinaryString(numbers[i]);

      // 모자란 비트 수를 채우기 위해 패딩 처리 후 비트를 뽑는다
      bin = bin.length() < s.length() ? s.substring(0, s.length() - bin.length()) + bin : bin;
      sb.append(bin, numbers.length - 1 - i, numbers.length - i);
    }

    return Integer.parseInt(sb.reverse().toString(), 2);
  }
}
