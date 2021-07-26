package com.hongeee.programmers.skills.level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.

예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.

경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
0	[]	[]	[7,4,5,6]
1~2	[]	[7]	[4,5,6]
3	[7]	[4]	[5,6]
4	[7]	[4,5]	[6]
5	[7,4]	[5]	[6]
6~7	[7,4,5]	[6]	[]
8	[7,4,5,6]	[]	[]
따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.

solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.

제한 조건
bridge_length는 1 이상 10,000 이하입니다.
weight는 1 이상 10,000 이하입니다.
truck_weights의 길이는 1 이상 10,000 이하입니다.
모든 트럭의 무게는 1 이상 weight 이하입니다.
입출력 예
bridge_length	weight	truck_weights	return
2	10	[7,4,5,6]	8
100	100	[10]	101
100	100	[10,10,10,10,10,10,10,10,10,10]	110
 * @author ishong
 *
 */
public class Solution2 {
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		System.out.println(s.solution(2, 10, new int[] { 7, 4, 5, 6 }));
		System.out.println(s.solution(100, 10, new int[] { 10 }));
		System.out.println(s.solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }));
		System.out.println(s.solution2(2, 10, new int[] { 7, 4, 5, 6 }));
		System.out.println(s.solution2(100, 10, new int[] { 10 }));
		System.out.println(s.solution2(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }));
	}
	
	/**
	 * Completed
	 * 
	 * @param bridge_length
	 * @param weight
	 * @param truck_weights
	 * @return
	 */
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		int currentWeight = 0;
		int index = 0;
		
		// 큐 초기화, 사이즈만큼 모든 element를 0으로 채운다
		// 큐의 한 칸은 1초에 건널 수 있는 다리 구간, 즉 1 length
		for (int i = 0; i < bridge_length; i++) {
			queue.add(0);
		}
		
		do {
			currentWeight = end(queue, currentWeight);
			
			if (index < truck_weights.length && currentWeight + truck_weights[index] <= weight) {
				// 아직 모든 트럭이 다리에 진입하지 않았고, 다리에 다음 트럭이 진입해도 될 경우
				// 큐에 트럭을 넣어주고 현재 무게 증가
				currentWeight = start(queue, truck_weights[index], currentWeight);
				index++;
			} else {
				// 트럭이 진입할 수 없으므로 큐에 0을 넣어줌
				start(queue, 0, currentWeight);
			}
			
			answer++;
		} while (currentWeight != 0);
		
		return answer;
	}
	
	/**
	 * 트럭이 다리에 진입함
	 * @param queue
	 * @param truck_weights
	 * @param currentWeight
	 * @return
	 */
	private int start(Queue<Integer> queue, int truck_weights, int currentWeight) {
		queue.add(truck_weights);
		return currentWeight + truck_weights;
	}
	
	/**
	 * 트럭이 다리를 모두 건넘
	 * @param queue
	 * @param currentWeight
	 * @return
	 */
	private int end(Queue<Integer> queue, int currentWeight) {
		Integer truck_weight = queue.poll();
		
		if (truck_weight != null) {
			currentWeight -= truck_weight;
		}
		
		return currentWeight;
	}
	
	// 검색 답변
	public int solution2(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		int max = 0;
		
		for (int w : truck_weights) {
			while (true) {
				if (q.isEmpty()) {
					q.offer(w);
					max += w;
					answer++;
					break;
				} else if (q.size() == bridge_length) {
					max -= q.poll();
				} else {
					if (max + w >  weight) {
						q.offer(0);
						answer++;
					} else {
						q.offer(w);
						max += w;
						answer++;
						break;
					}
				}
			}
		}
		
		return answer + bridge_length;
	}
}
