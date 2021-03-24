package com.ishong.programmers.test.coupang;

import java.util.Arrays;

/**
 * 문제 설명
서로 다른 자연수들로 이루어진 배열 arr와 숫자 n이 입력으로 주어집니다.

만약 배열 arr에 있는 서로 다른 2개의 자연수를 합하여 숫자 n을 만드는 것이 가능하면 true를, 불가능하면 false를 반환하는 함수를 작성하세요.

제한사항
배열의 크기는 1 이상 500,000이하의 자연수입니다.
배열의 원소는 1 이상 100,000,000이하의 자연수입니다.
n은 100,000,000 이하인 자연수입니다.
입출력 예
arr	n	result
[5, 3, 9, 13]	8	true
[5, 3, 9, 13]	7	false
입출력 예 설명
입출력 예 #1
배열 arr = [5, 3, 9, 13]인 경우 n = 8 일 때, 5 + 3 = 8이므로 true를 반환합니다.

입출력 예 #2
배열 arr = [5, 3, 9, 13]인 경우 n = 7 일 때, 배열 arr에 있는 두 숫자를 합하여 7을 만드는 경우는 없으므로 false를 반환합니다.

 * @author ishong
 *
 */
public class Question3 {
	
	public static void main(String[] args) {
		Question3 q = new Question3();
		System.out.println(q.solution(new int[] { 5, 3, 9, 13 }, 8));
		System.out.println(q.solution(new int[] { 5, 3, 9, 13 }, 7));
	}
	
	public boolean solution(int[] arr, int n) {
		int sum = 0;
		// 작은 수부터 합하기 위해 Sort
		Arrays.sort(arr);

		// 완전탐색
        for (int i = 0; i < arr.length; i++) {
        	// 오름차순 정렬이 된 상태이므로 합할 두 수 중 첫번째 수가 n보다 클 경우 return false
        	if (arr[i] >= n) {
        		return false;
        	}
        	
            for (int j = i + 1; j < arr.length; j++) {
            	// 합할 두 수 중 두번째 수가 n보다 클 경우 return false
            	if (arr[j] >= n) {
            		return false;
            	}
            	
            	sum = arr[i] + arr[j];
            	
            	// 오름차순 정렬이 된 상태이므로 두 수를 더한 값이 n보다 클 경우 다음 수를 더하더라도 n보다 크므로 break 
            	if (sum > n) {
            		break;
            	}
            	
                if (sum == n) {
                    return true;
                }
            }
        }

        return false;
    }
	
//	public boolean solution(int[] arr, int n) {
//		int sum = 0;
//		// 작은 수부터 합하기 위해 Sort
//		Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//        	if (arr[i] >= n) {
//        		return false;
//        	}
//        	
//            for (int j = arr.length - 1; j > i; j--) {
//            	if (arr[j] >= n) {
//            		break;
//            	}
//            	
//            	sum = arr[i] + arr[j];
//            	
//            	if (sum > n) {
//            		break;
//            	}
//            	
//                if (sum == n) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
}
