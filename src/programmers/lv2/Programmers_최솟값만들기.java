package programmers.lv2;

import java.util.*;

class Programmers_최솟값만들기 {
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;

        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[A.length-1-i];
        }

        return answer;
    }
}