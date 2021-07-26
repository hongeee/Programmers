package com.hongeee.programmers.test.coupang;

/**
 * 문제 설명
N개의 원소를 가진 수열 A가 있습니다. 수열의 i 번째 수부터 j 번째 수까지의 합이 S가 되도록 하는 (i, j) 쌍의 개수를 구하려고 합니다(단, i ≤ j ). 1차원 배열 형태의 수열 A와 자연수 S가 매개변수로 주어질 때, 가능한 (i, j) 쌍의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
A는 자연수가 들어있는 1차원 배열이며, 길이는 100,000 이하입니다.
A의 원소는 2,000 이하의 자연수입니다.
S는 2,000 이하의 자연수입니다.
입출력 예
A	S	result
[1,1,1,1]	3	2
입출력 예 설명
입출력 예 #1

첫 번째 수부터 세 번째 수까지의 합이 3입니다.
두 번째 수부터 네 번째 수까지의 합이 3입니다.
따라서, 수열의 i 번째 수부터 j 번째 수까지의 합이 S가 되도록 하는 (i, j) 쌍은 (1, 3), (2, 4)로 두 개가 있습니다.

 * @author ishong
 *
 */
public class Question1 {
	
	public static void main(String[] args) {
		Question1 q = new Question1();
		System.out.println(q.solution(new int[] { 1, 1, 1, 1 }, 3));
	}
	
	public int solution(int []A, int S) {
        int answer = 0;
        int sum = 0;
        
        for (int i = 0; i < A.length; i++) {
        	// 이미 시작값부터 S보다 크므로 다음 루프로 skip
        	if (A[i] > S) {
        		continue;
        	}
        	
        	sum = A[i];
        	
        	for (int j = i + 1; j < A.length; j++) {
        		// 합하더라도 S보다 클 경우 break
        		if (A[j] > S) {
        			break;
        		}
        		
        		sum += A[j];
        		
        		// 합이 S보다 커졌으므로 나머지 수를 더할 필요 없이 break
        		if (sum > S) {
        			break;
        		}
        		
        		// 합이 S와 일치할 경우 쌍의 개수 증가
        		if (sum == S) {
        			answer++;
        			
        			// 나머지 수를 더할 필요가 없으므로 break
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
