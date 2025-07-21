package boj.silver;

import java.util.*;

class BOJ_11659_구간합구하기4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N+1];
        int[] prefixSum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            System.out.println(prefixSum[end] - prefixSum[start-1]);
        }
    }
}