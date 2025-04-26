package programmers.lv2;

import java.util.*;

class Programmers_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {

        for (int i=0; i<progresses.length; i++) {
            int require = (100-progresses[i])/speeds[i];
            int rest = (100-progresses[i])%speeds[i];
            if (rest == 0) {
                progresses[i] = require;
            } else progresses[i] = require+1;
        }

        Queue<Integer> que = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();

        for (int i=0; i<progresses.length; i++) {
            que.offer(progresses[i]);
        }

        while (!que.isEmpty()) {
            int cnt=0;
            int temp = que.poll();
            cnt++;
            while (!que.isEmpty() && temp>=que.peek()) {
                que.poll();
                cnt++;
            }
            arr.add(cnt);
        }

        int[] answer = arr.stream().mapToInt(i->i).toArray();
        return answer;
    }
}