package boj.silver;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1940_주몽 {

    static int N, M;
    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(solution());
    }

    public static int solution() {
        int lt = 0, rt = N-1;
        int answer = 0;
        while (lt<rt) {
            if (arr[lt] + arr[rt] == M) {
                answer++;
                lt++;
            } else if (arr[lt] + arr[rt] > M) rt--;
            else lt++;
        }
        return answer;
    }
}