package programmers.lv2;

import java.util.*;

class Programmers_연속부분수열합의개수 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
        for (int i=1; i<=len; i++) {
            for (int j=0; j<len; j++) {
                int sum = 0;
                for (int k=j; k<j+i; k++) {
                    sum += elements[k%len];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}