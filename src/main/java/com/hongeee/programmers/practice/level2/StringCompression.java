package com.hongeee.programmers.practice.level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 문자열 압축
 * 문제 설명
 * 데이터 처리 전문가가 되고 싶은 "어피치"는 문자열을 압축하는 방법에 대해 공부를 하고 있습니다. 최근에 대량의 데이터 처리를 위한 간단한 비손실 압축 방법에 대해 공부를 하고 있는데, 문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현하여 더 짧은 문자열로 줄여서 표현하는 알고리즘을 공부하고 있습니다.
 * 간단한 예로 "aabbaccc"의 경우 "2a2ba3c"(문자가 반복되지 않아 한번만 나타난 경우 1은 생략함)와 같이 표현할 수 있는데, 이러한 방식은 반복되는 문자가 적은 경우 압축률이 낮다는 단점이 있습니다. 예를 들면, "abcabcdede"와 같은 문자열은 전혀 압축되지 않습니다. "어피치"는 이러한 단점을 해결하기 위해 문자열을 1개 이상의 단위로 잘라서 압축하여 더 짧은 문자열로 표현할 수 있는지 방법을 찾아보려고 합니다.
 * 
 * 예를 들어, "ababcdcdababcdcd"의 경우 문자를 1개 단위로 자르면 전혀 압축되지 않지만, 2개 단위로 잘라서 압축한다면 "2ab2cd2ab2cd"로 표현할 수 있습니다. 다른 방법으로 8개 단위로 잘라서 압축한다면 "2ababcdcd"로 표현할 수 있으며, 이때가 가장 짧게 압축하여 표현할 수 있는 방법입니다.
 * 
 * 다른 예로, "abcabcdede"와 같은 경우, 문자를 2개 단위로 잘라서 압축하면 "abcabc2de"가 되지만, 3개 단위로 자른다면 "2abcdede"가 되어 3개 단위가 가장 짧은 압축 방법이 됩니다. 이때 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여주면 됩니다.
 * 
 * 압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이를 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * s의 길이는 1 이상 1,000 이하입니다.
 * s는 알파벳 소문자로만 이루어져 있습니다.
 * 입출력 예
 * s	result
 * "aabbaccc"	7
 * "ababcdcdababcdcd"	9
 * "abcabcdede"	8
 * "abcabcabcabcdededededede"	14
 * "xababcdcdababcdcd"	17
 * 입출력 예에 대한 설명
 * 입출력 예 #1
 * 
 * 문자열을 1개 단위로 잘라 압축했을 때 가장 짧습니다.
 * 
 * 입출력 예 #2
 * 
 * 문자열을 8개 단위로 잘라 압축했을 때 가장 짧습니다.
 * 
 * 입출력 예 #3
 * 
 * 문자열을 3개 단위로 잘라 압축했을 때 가장 짧습니다.
 * 
 * 입출력 예 #4
 * 
 * 문자열을 2개 단위로 자르면 "abcabcabcabc6de" 가 됩니다.
 * 문자열을 3개 단위로 자르면 "4abcdededededede" 가 됩니다.
 * 문자열을 4개 단위로 자르면 "abcabcabcabc3dede" 가 됩니다.
 * 문자열을 6개 단위로 자를 경우 "2abcabc2dedede"가 되며, 이때의 길이가 14로 가장 짧습니다.
 * 
 * 입출력 예 #5
 * 
 * 문자열은 제일 앞부터 정해진 길이만큼 잘라야 합니다.
 * 따라서 주어진 문자열을 x / ababcdcd / ababcdcd 로 자르는 것은 불가능 합니다.
 * 이 경우 어떻게 문자열을 잘라도 압축되지 않으므로 가장 짧은 길이는 17이 됩니다.
 * 
 * @author ishong
 *
 */
public class StringCompression {
	
	public static void main(String[] args) {
		StringCompression solution = new StringCompression();
		System.out.println(solution.solution("aabbaccc"));
		System.out.println(solution.solution("ababcdcdababcdcd"));
		System.out.println(solution.solution("abcabcdede"));
		System.out.println(solution.solution("abcabcabcabcdededededede"));
		System.out.println(solution.solution("xababcdcdababcdcd"));
	}
	
	/**
	 * Completed
	 * 
	 * @param s
	 * @return
	 */
	public int solution(String s) {
        int answer = s.length();
        
        // 자를 문자열 단위를 1부터 주어진 s의 길이까지 계산
        for (int unitLength = 1; unitLength <= s.length(); unitLength++) {
        	// 자를 문자열 단위가 가장 짧은 길이보다 커질 경우 의미가 없으므로 break;
        	if (unitLength > answer) {
        		break;
        	}
        	
        	Queue<String> q = new LinkedList<String>();
        	
        	// 길이만큼 잘라지는 만큼 queue에 넣고, 남는 문자열 처리
        	for (int i = 0; i < s.length(); i += unitLength) {
						q.add(i + unitLength > s.length() ? s.substring(i, s.length())
						: s.substring(i, i + unitLength));
        	}
        	
        	String current = q.poll();
        	int length = 0;
        	int count = 1;
        	
        	while (!q.isEmpty()) {
        		String next = q.poll();

        		if (current.equals(next)) {
        			// 같은 문자열일 경우 count만 증가
        			count++;
        		} else {
        			// 다른 문자열일 경우 이전 문자열에 대한 length 추가
        			if (count == 1) {
        				// 한 번 반복된 문자열일 경우 1을 생략하므로
        				length += current.length();
        			} else {
        				// 두 번 이상 반복된 문자열일 경우 반복된 횟수만큼 숫자를 붙여주므로
        				length += String.valueOf(count).length() + current.length();
        			}
        			
        			// count 초기화
        			count = 1;
        			
        			// 다음 문자열 비교를 위해 현재 문자열 갱신
        			current = next;
        		}
        	}
        	
        	// 마지막 남은 문자열에 대한 길이 추가
        	// 다른 문자열일 경우 이전 문자열에 대한 length 추가
        	if (count == 1) {
        		// 한 번 반복된 문자열일 경우 1을 생략하므로
        		length += current.length();
        	} else {
        		// 두 번 이상 반복된 문자열일 경우 반복된 횟수만큼 숫자를 붙여주므로
        		length += String.valueOf(count).length() + current.length();
        	}
        	
        	// 가장 작은 길이를 구하기 위해 비교
        	if (answer > length) {
        		answer = length;
        	}
        }
        
        return answer;
    }
	
	public int otherSolution(String s) {
		int answer = 0;

		for (int i = 1; i <= (s.length() / 2) + 1; i++) {
			int result = getSplitedLength(s, i, 1).length();
			answer = i == 1 ? result : (answer > result ? result : answer);
		}

		return answer;
	}
	
	public String getSplitedLength(String s, int n, int repeat){
		if (s.length() < n)
			return s;
		
		String result = "";
		String preString = s.substring(0, n);
		String postString = s.substring(n, s.length());

		// 불일치 -> 현재까지 [반복횟수 + 반복문자] 조합
		if (!postString.startsWith(preString)) {
			if (repeat == 1)
				return result += preString + getSplitedLength(postString, n, 1);
			return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
		}

		return result += getSplitedLength(postString, n, repeat + 1);
    }
	
	public int otherSolution2(String s) {
		int min = s.length();
		int len = s.length() / 2 + 1;
		for (int i = 1; i < len; i++) {
			String before = "";
			int sum = 0;
			int cnt = 1;
			for (int j = 0; j < s.length();) {
				int start = j;
				j = (j + i > s.length()) ? s.length() : j + i;
				String temp = s.substring(start, j);
				if (temp.equals(before)) {
					cnt++;
				} else {
					if (cnt != 1) {
						sum += (int) Math.log10(cnt) + 1;
					}
					cnt = 1;
					sum += before.length();
					before = temp;
				}
			}
			sum += before.length();
			if (cnt != 1) {
				sum += (int) Math.log10(cnt) + 1;
			}
			min = (min > sum) ? sum : min;
		}

		return min;
	}
}
