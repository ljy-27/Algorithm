package programmers.lv2;

import java.util.*;

class Programmers_프로세스 {
    public int solution(int[] priorities, int location) {
        Queue<Process> que = new ArrayDeque<>();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i=0; i<priorities.length; i++) {
            que.offer(new Process(priorities[i], i));
            pq.offer(priorities[i]);
        }

        while (true) {
            Process temp = que.poll();
            if (temp.priority < pq.peek()) que.offer(temp);
            else {
                pq.poll();
                answer++;
                if (temp.index == location) break;
            }
        }

        return answer;
    }
}

class Process {
    int priority;
    int index;

    public Process (int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}