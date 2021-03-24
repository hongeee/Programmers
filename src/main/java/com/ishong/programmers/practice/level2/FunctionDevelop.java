package com.ishong.programmers.practice.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 문제 분류 - 스택/큐
 * 문제 설명
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 * 
 * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
 * 
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 * 
 * 제한 사항
 * 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
 * 작업 진도는 100 미만의 자연수입니다.
 * 작업 속도는 100 이하의 자연수입니다.
 * 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
 * 입출력 예
 * progresses	speeds	return
 * [93, 30, 55]	[1, 30, 5]	[2, 1]
 * [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
 * 입출력 예 설명
 * 입출력 예 #1
 * 첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
 * 두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
 * 세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.
 * 
 * 따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
 * 
 * 입출력 예 #2
 * 모든 기능이 하루에 1%씩 작업이 가능하므로, 작업이 끝나기까지 남은 일수는 각각 5일, 10일, 1일, 1일, 20일, 1일입니다. 어떤 기능이 먼저 완성되었더라도 앞에 있는 모든 기능이 완성되지 않으면 배포가 불가능합니다.
 * 
 * 따라서 5일째에 1개의 기능, 10일째에 3개의 기능, 20일째에 2개의 기능이 배포됩니다.
 * @author ishong
 *
 */
public class FunctionDevelop {
	public static void main(String[] args) {
		FunctionDevelop functionDevelop = new FunctionDevelop();
		
		int[] answer = functionDevelop.solution(new int[]{ 93, 30, 55 }, new int[]{ 1, 30, 5 });
		
		for (int i : answer) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		answer = functionDevelop.solution(new int[]{ 95, 90, 99, 99, 80, 99 }, new int[]{ 1, 1, 1, 1, 1, 1 });
		
		for (int i : answer) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		answer = functionDevelop.solution(new int[]{ 99, 99, 99 }, new int[]{ 1, 1, 1 });
		
		for (int i : answer) {
			System.out.print(i + " ");
		}
		
		int[] a = new int[]{ 99, 99, 99 };
		
		a = Arrays.copyOfRange(a, 3, 3);
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 코드 실행시 성공, 제출 후 채점하기에서 실패
	 * @param progresses
	 * @param speeds
	 * @return
	 */
	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = null;
        List<Integer> answerList = new ArrayList<Integer>();
        
        do {
        	int index = 0;
        	
        	for (int i = 0; i < progresses.length; i++) {
        		// 1 Loop 당 1일, 진도를 증가시킴
        		progresses[i] += speeds[i];
        		
        		// 이전 작업이 완료되었고 현재 작업도 완료되었을 경우
        		if (index - i == 0 && progresses[i] >= 100) {
        			index++;
        		}
        	}
        	
        	if (index > 0) {
        		answerList.add(index);
        		
        		if (index == progresses.length) {
        			break;
        		}
        		
    			progresses = Arrays.copyOfRange(progresses, index, progresses.length);
        	}
        } while (progresses.length > 0);
        
        if (answerList.size() > 0) {
        	answer = new int[answerList.size()];
        	
        	for (int i = 0; i < answerList.size(); i++) {
        		answer[i] = answerList.get(i);
        	}
        }
        
        return answer;
    }
	
	/**
	 * 퍼옴
	 * 
	 * @param progresses
	 * @param speeds
	 * @return
	 */
	public int[] otherSolution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			// 남은 진도를 속도로 나누어 떨어지면 몫을, 나누어 떨어지지 않으면 몫 + 1(하루가 더 걸리므로)
			q.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
					: (100 - progresses[i]) / speeds[i] + 1);
		}

		// 결과를 저장하기 위한 List
		List<Integer> result = new ArrayList<Integer>();
		
		// 가장 처음 작업이 끝나는 데 걸린 일 수가 기준
		int standard = q.poll();
		int cnt = 1;
		
		while (!q.isEmpty()) {
			// 다음 작업이 끝나는 데 걸린 일 수
			int num = q.poll();
			
			// 이전 작업이 끝나는 데 걸린 일 수 보다 작거나 같을 경우 함께 완료되므로 카운트
			if (standard >= num) {
				cnt++;
			} else {
				// 그렇지 않은 경우 현재까지 카운트 된 완료된 작업 수를 결과 List에 추가
				result.add(cnt);
				
				// 카운트 수 초기화 및 기준 일수를 현재 큐에서 꺼낸 일 수로 변경
				cnt = 1;
				standard = num;
			}
		}
		
		result.add(cnt);
		
		int[] answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}
}
