package boj.bronze;

import java.util.*;

public class BOJ_2798_블랙잭 {

    public int solution(int n, int m, int[] arr) {
        int temp, answer=0;
        for (int i=0; i<(n-2); i++) {
            for (int j=i+1; j<(n-1); j++) {
                for (int k=j+1; k<n; k++) {
                    temp = arr[i] + arr[j] + arr[k];
                    if (temp<=m && m-answer>m-temp) {
                        answer = temp;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BOJ_2798_블랙잭 T = new BOJ_2798_블랙잭();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}