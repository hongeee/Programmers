package com.hongeee.programmers.skills.level1;

/**
 * 문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
s	return
a234	false
1234	true

 * @author ishong
 *
 */
public class Solution3 {
	
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution("a234"));
		System.out.println(s.solution("1234"));
	}
	
	public boolean solution(String s) {
        boolean answer = true;
        
        // 문자열 길이 4 또는 6 확인
        if (s.length() != 4 && s.length() != 6) {
        	return false;
        }
        
        String pattern = "[0-9]*";
        
        if (!s.matches(pattern)) {
        	return false;
        }
        
        return answer;
    }
}
