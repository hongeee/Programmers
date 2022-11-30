package com.hongeee.programmers.test.tmapmobility;

import java.util.Scanner;

/**
 * 이 문제에는 표준 입력으로 정수 n이 주어집니다.
 * 별(*) 문자를 이용해 높이가 n인 삼각형을 출력해보세요.
 *
 * 제한 조건
 *  - n은 100 이하인 자연수입니다.
 *
 * 예시
 * 입력
 * 3
 * 출력
 * *
 * **
 * ***
 */
public class Practice2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < a; i++) {
      System.out.println(sb.append("*"));
    }
  }
}
