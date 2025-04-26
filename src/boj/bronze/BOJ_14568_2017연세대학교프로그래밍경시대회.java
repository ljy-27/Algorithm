package boj.bronze;

import java.util.Scanner;

public class BOJ_14568_2017연세대학교프로그래밍경시대회 {

    public int solution(int n) {
        int answer = 0;
        int nk, yh, th;
        for (nk=1; nk<n; nk++) {
            for (yh=1; yh<(n-nk); yh++) {
                for (th=1; th<=(n-nk-yh); th++) {
                    if ((nk+yh+th)==n && nk-yh>=2 && th%2==0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BOJ_14568_2017연세대학교프로그래밍경시대회 T = new BOJ_14568_2017연세대학교프로그래밍경시대회();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(T.solution(n));
    }
}