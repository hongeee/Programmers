package com.ishong.programmers.skills.level1;

/**
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

 * @author ishong
 *
 */
public class Solution1 {
	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		System.out.println(solution.solution(10));
		System.out.println(solution.solution(5));
		System.out.println(solution.solution(3));
	}
	
	public int solution(int n) {
        int answer = 0;
        
        // 제한 조건에 해당되지 않으므로 제외
        if (n <= 1 || n > 1000000) {
        	return 0;
        }
        
        // 2는 소수의 조건을 만족하고 위 조건을 만족하지 않을 경우 2는 무조건 포함되므로
        // 소수의 개수는 기본적으로 1을 만족함
        answer++;
        
        for (int i = 3; i <= n; i++) {
        	if (isPrimeNumber(i)) {
        		answer++;
        	}
        }
        
        return answer;
    }
	
	private boolean isPrimeNumber(int n) {
		// 2를 제외한 모든 소수는 홀수
		if (n % 2 == 0) {
			return false;
		}
		
		// 3부터 짝수를 제외한 홀수로 나누어지는지 확인
		for (int i = 3; i < n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
