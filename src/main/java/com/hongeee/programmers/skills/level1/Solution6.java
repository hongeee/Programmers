package com.hongeee.programmers.skills.level1;

/**
 * 문제 설명
String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
Kim은 반드시 seoul 안에 포함되어 있습니다.
입출력 예
seoul	return
[Jane, Kim]	김서방은 1에 있다

 * @author ishong
 *
 */
public class Solution6 {
	
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		System.out.println(s.solution(new String[] { "Jane", "Kim" }));
	}
	
	/**
	 * Completed
	 * 
	 * @param seoul
	 * @return
	 */
    public String solution(String[] seoul) {
        String kim = "Kim";
        StringBuffer sb = new StringBuffer("김서방은 ");
        
        for (int i = 0; i < seoul.length; i++) {
        	String element = seoul[i];
        	
        	if (element.equals(kim)) {
        		sb.append(i);
        		break;
        	}
        }
        
        sb.append("에 있다");
        
        return sb.toString();
    }
}
