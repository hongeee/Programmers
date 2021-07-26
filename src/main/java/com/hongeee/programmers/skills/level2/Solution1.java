package com.hongeee.programmers.skills.level2;

/**
 * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
입출력 예
numbers	return
17	3
011	2
입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

11과 011은 같은 숫자로 취급합니다.

 * @author ishong
 *
 */
public class Solution1 {
	private int answer = 0;
	private boolean[] isPrimeNumbers = null;
	private boolean[] visited = null;
	private int[] primeNumbers = new int[8];
	
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.solution("17"));
		System.out.println(s.solution("011"));
	}
	
	// 조합할 수 있는 모든 숫자를 조합해야 함
	// "1"일 경우 1 : 1가지
	// "17"일 경우 1, 7, 17, 77 조합 가능 : 4가지
	// "011"일 경우 0, 01, 01, 011, 1, 10, 11, 110, 1, 10, 11, 110 : 12가지
	// "1234"일 경우
	// 1, 2, 3, 4 : 4가지
	// 12, 13, 14, 21, 23, 24, 31, 32, 34, 41, 42, 43 : 12가지
	// 123, 124, 132, 134, 142, 143, 213, 214, 231, 234, 241, 243, 312, 314, 321, 324, 341, 342, 412, 413, 421, 423, 431, 432 : 24가지
	// 1234, 1243, 1324, 1342, 1423, 1432, 2134, 2143, 2314, 2341, 2413, 2431, 3124, 3142, 3214, 3241, 3412, 3421, 4123, 4132, 4213, 4231, 4312, 4321 : 24가지
	// 총 64
	// 1 -> 1
	// 2 -> 4
	// 3 -> 12
	// 4 -> 64
	
	public int solution(String numbers) {
		// 초기화
		answer = 0;
		isPrimeNumbers = new boolean[10000000];
		visited = new boolean[8];
		primeNumbers = new int[8];

		isPossible();
		
		for (int i = 1; i <= numbers.length(); i++) {
			dfs(0, i, numbers);
		}
		return answer;
	}

	public void dfs(int level, int end, String numbers) {
		if (level == end) {
			int num = 0;
			for (int i = 0; i < end; i++) {
				num *= 10;
				num += primeNumbers[i];
			}

			if (!isPrimeNumbers[num]) {
				isPrimeNumbers[num] = true; // 중복방지
				answer++;
			}
			return;
		}

		for (int i = 0; i < numbers.length(); i++) {
			if (!visited[i]) {
				visited[i] = true;
				primeNumbers[level] = numbers.charAt(i) - '0';
				dfs(level + 1, end, numbers);
				visited[i] = false;
			}
		}
	}

	public void isPossible() {
		isPrimeNumbers[0] = true;
		isPrimeNumbers[1] = true;
		
		for (int i = 2; i <= (9999999 / 2); i++) {
			for (int j = i + i; j <= 9999999; j += i) {
				isPrimeNumbers[j] = true;
			}
		}
	}
}
