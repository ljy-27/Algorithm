package boj.silver;

import java.util.Scanner;

public class BOJ_2003_수들의합2 {

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt=0, rt = 0;

        while (lt<n && rt<n) {
            int sum=0;
            for (int i = lt; i <= rt; i++) {
                sum += arr[i];
            }
            if (sum == m) {
                answer++;
                if (lt==rt) rt++;
                else lt++;
            }
            else if (sum < m) {
                rt++;
            }
            else lt++;
        }
        if (lt!=n-1) {
            while(lt<n) {
                if (arr[lt] + arr[n-1] == m) {
                    answer++;
                }
                lt++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BOJ_2003_수들의합2 T = new BOJ_2003_수들의합2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n,m,arr));
    }
}