package programmers.lv2;

import java.util.*;

class Programmers_귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer value : map.values()) {
            pq.offer(value);
        }

        while (k>0) {
            k -= pq.poll();
            answer++;
        }

        return answer;
    }
}