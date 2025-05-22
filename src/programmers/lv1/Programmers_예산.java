package programmers.lv1;

import java.util.*;

class Programmers_예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int answer=0;
        for (int j : d) {
            if (budget - j >= 0) {
                answer++;
                budget -= j;
            } else break;
        }
        return answer;
    }
}