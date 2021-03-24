package com.ishong.programmers.practice.level2;

/**
 * 문제 설명
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

제한 사항
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
입출력 예제
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false
입출력 예 설명
입출력 예 #1
앞에서 설명한 예와 같습니다.

입출력 예 #2
한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.

입출력 예 #3
첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.

 * @author ishong
 *
 */
public class PhoneNumber {
	public static void main(String[] args) {
		PhoneNumber p = new PhoneNumber();
		System.out.println(p.solution(new String[] { "119", "97674223", "1195524421" }));
		System.out.println(p.solution(new String[] { "123", "456", "789" }));
		System.out.println(p.solution(new String[] { "12", "123", "1235", "567", "88" }));
	}
	
	/**
	 * Complete
	 * 정확성: 84.6
	 * 효율성: 15.4
	 * @param phone_book
	 * @return
	 */
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for (int i = 0; i < phone_book.length; i++) {
        	String num1 = phone_book[i];
        	
        	for (int j = 0; j < phone_book.length; j++) {
        		// 동일한 전화번호일 경우 스킵
        		if (i == j) {
        			continue;
        		}
        		
        		String num2 = phone_book[j];
        		
        		// num1이 num2의 접두사인지 확인
        		if (num1.length() > num2.length()) {
        			// 접두사가 될 번호가 접두사를 포함할 번호보다 길 수 없으므로 스킵
        			continue;
        		}
        		
        		if (num2.startsWith(num1)) {
        			answer = false;
        			break;
        		}
        	}
        	
        	// 이미 결과가 false일 경우 남은 과정 스킵
        	if (!answer) {
        		break;
        	}
        }
        
        return answer;
    }
	
	/**
	 * 다른 풀이
	 * 정확성: 
	 * 효율성: 
	 * @param phone_book
	 * @return
	 */
	public boolean solution2(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
        	for (int j = i + 1; j < phone_book.length; j++) {
        		String num1 = phone_book[i];
        		String num2 = phone_book[j];
        		
        		if (num2.startsWith(num1)) {
        			return false;
        		}
        		
        		if (num1.startsWith(num2)) {
        			return false;
        		}
        	}
        }
        
        return true;
	}
}
