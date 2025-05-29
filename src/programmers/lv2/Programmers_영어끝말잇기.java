package programmers.lv2;

import java.util.*;

class Programmers_영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();

        for (int i=0; i<words.length; i++) {
            if (i==0) {
                set.add(words[i]);
                continue;
            }
            String before = words[i-1];
            String current = words[i];
            boolean flag = set.contains(current) || before.charAt(before.length()-1) != current.charAt(0);
            if (flag) {
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            } else set.add(current);
        }

        return answer;
    }
}