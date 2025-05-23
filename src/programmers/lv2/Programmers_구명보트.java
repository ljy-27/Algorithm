package programmers.lv2;

import java.util.*;

class Programmers_구명보트 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;

        int p1 = 0, p2 = people.length-1;
        while (p1<p2) {
            if (people[p1]+people[p2]<=limit) {
                p1++;
                p2--;
                answer++;
            } else {
                p2--;
                answer++;
            }
        }
        if (p1==p2) answer++;

        return answer;
    }
}