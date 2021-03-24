package com.ishong.programmers.practice.level2;

/**
 * 문제 설명
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법	124 나라	10진법	124 나라
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 500,000,000이하의 자연수 입니다.
입출력 예
n	result
1	1
2	2
3	4
4	11

 * @author ishong
 *
 */
public class NumberOf124 {
	
	public static void main(String[] args) {
		NumberOf124 n = new NumberOf124();
		System.out.println(n.solution(1));
		System.out.println(n.solution(2));
		System.out.println(n.solution(3));
		System.out.println(n.solution(4));
		System.out.println(n.solution(5));
		System.out.println(n.solution(6));
		System.out.println(n.solution(7));
		System.out.println(n.solution(8));
		System.out.println(n.solution(9));
		System.out.println(n.solution(10));
	}
	
	public String solution(int n) {
		if (n < 1 || n > 500000000) {
			return "";
		}
		
		// 3으로 나누어 나머지에 따라 부여받는 숫자 정의
		String[] numOf124 = { "4", "1", "2" };
		StringBuffer sb = new StringBuffer();
		
		while (n > 0) {
			int mod = n % 3;
			n /= 3;
			
			// 3으로 나누어졌을 경우 자리수가 바뀌어야 하므로 감소
			if (mod == 0) {
				n--;
			}
			
			sb.insert(0, numOf124[mod]);
		}
		
		return sb.toString();
	}
}
