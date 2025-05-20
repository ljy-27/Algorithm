package programmers.lv2;

public class Programmers_점프와순간이동 {
    public int solution(int n) {
        int answer = 0;

        while (n > 1) {
            if (n%2 == 0) n = n/2;
            else {
                n-=1;
                answer++;
            }
        }

        return answer+1;
    }
}