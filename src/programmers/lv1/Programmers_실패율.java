package programmers.lv1;

import java.util.*;

class Programmers_실패율 {
    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];

        PriorityQueue<Stage> pq = new PriorityQueue<>(
                (a, b)-> {
                    if (Double.compare(b.failRate, a.failRate) != 0) {
                        return Double.compare(b.failRate, a.failRate);
                    } else {
                        return Integer.compare(a.stageNum, b.stageNum);
                    }
                }
        );

        for (int i=1; i<=N; i++) {
            double getStage = 0;
            double fail=0;
            for (int x : stages) {
                if (x>=i) getStage++;
                if (x==i) fail++;
            }
            double failRate = (getStage == 0) ? 0 : (fail/getStage);
            pq.offer(new Stage(i, failRate));
        }
        for (int j=0; j<N; j++) {
            if (!pq.isEmpty()) {
                answer[j]=pq.poll().stageNum;
            }
        }
        return answer;

    }
}

class Stage {
    int stageNum;
    double failRate;

    public Stage(int stageNum, double failRate) {
        this.stageNum = stageNum;
        this.failRate = failRate;
    }
}