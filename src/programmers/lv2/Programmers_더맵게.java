package programmers.lv2;

import java.util.*;

class Programmers_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.offer(i);
        }

        boolean flag = true;
        while(flag) {
            int temp = pq.poll();
            if (temp < K) {
                if (pq.isEmpty()) {
                    return -1;
                }
                int next = pq.poll();
                pq.offer(temp + next*2);
                answer++;
            } else flag = false;
        }

        return answer;
    }
}