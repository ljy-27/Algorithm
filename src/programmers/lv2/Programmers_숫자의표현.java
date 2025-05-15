package programmers.lv2;

class Programmers_숫자의표현 {
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n/2; i++) {
            int start = i;
            for (int j=start; j<=n/2; j++) {
                start+=j+1;
                if (start==n) {
                    answer++;
                    break;
                }
                if (start>n) break;
            }
        }

        return answer+1;
    }
}