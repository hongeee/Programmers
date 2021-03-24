package com.ishong.programmers.skills.level1;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
입출력 예
participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
입출력 예 설명
예제 #1
leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

 * @author ishong
 *
 */
public class Solution4 {
	
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution(new String[] { "leo", "kiki", "eden" }, new String[] { "eden", "kiki" }));
		System.out.println(s.solution(new String[] { "marina", "josipa", "nikola", "vinko", "filipa" }, new String[] { "josipa", "filipa", "marina", "nikola" }));
		System.out.println(s.solution(new String[] { "mislav", "stanko", "mislav", "ana" }, new String[] { "stanko", "ana", "mislav" }));
	}
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        CopyOnWriteArrayList<String> participantList = new CopyOnWriteArrayList<String>(participant);
        CopyOnWriteArrayList<String> completionList = new CopyOnWriteArrayList<String>(completion);
        
        for (int i = participantList.size() - 1; i >= 0; i--) {
        	String s = participantList.get(i);
        	
        	if (!completionList.contains(s)) {
        		answer = s;
        		break;
        	} else {
        		participantList.remove(i);
        	}
        }
        
        if (participantList.size() == 1) {
    		answer = participantList.get(0);
    	}
        
        return answer;
    }
}
