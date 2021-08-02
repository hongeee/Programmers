package com.hongeee.programmers.test.sixshop;

import java.util.Arrays;

/**
 * 문제 설명
 * 게임에 접속한 모든 유저에게 아이템을 지급하는 출석 이벤트를 k일 동안 진행하려 합니다. 날짜별 추정 접속자 수가 주어질 때, k일 동안 추정 접속자 수의 합이 최대가 되도록 이벤트 기간을 정하려 합니다.
 *
 * 날짜별 추정 접속자 수가 순서대로 담긴 배열 estimates와 출석 이벤트를 진행하는 기간 k가 매개변수로 주어집니다. k일 동안 추정 접속자 수의 합이 최대가 되도록 이벤트 기간을 정했을 때, 그 때의 추정 접속자 수 합을 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한 조건
 * estimates는 길이가 1 이상 200,000 이하인 배열입니다.
 * estimates의 원소는 10,000 이하인 자연수입니다.
 * k는 1 이상 100,000 이하이고, estimates의 길이보다 작거나 같습니다.
 * 입출력 예
 * estimates	k	return
 * [5, 1, 9, 8, 10, 5]	3	27
 * [10, 1, 10, 1, 1, 4, 3, 10]	6	29
 * 예시 설명
 * 예시 #1
 * 출석 이벤트를 3일간 열려고 합니다. 3일간 추정 접속자 수의 합이 최대가 되는 경우는 [9, 8, 10]입니다. 따라서 27을 return합니다.
 *
 * 예시 #2
 * 출석 이벤트를 6일간 열려고 합니다. 6일간 추정 접속자 수의 합이 최대가 되는 경우는 [10, 1, 1, 4, 3, 10]입니다. 따라서 29를 return 합니다.
 */
public class Solution1 {

    public int solution(int[] estimates, int k) {
        int answer = 0;

        // 연속된 k 일간의 부분합을 구함
        for (int i = 0; i < estimates.length - k + 1; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += estimates[j];
            }

            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }

    // 100/100
    public int solution2(int[] estimates, int k) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += estimates[i];
        }

        answer = sum;

        for (int i = 0; i < estimates.length - k; i++) {
            sum = sum - estimates[i] + estimates[i + k];

            if (answer < sum) {
                answer = sum;
            }
        }

        return answer;
    }
}
