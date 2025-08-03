package boj.silver;

import java.util.Scanner;

public class BOJ_17266_어두운굴다리 {

    static int N, M;
    static int[] location;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        location = new int[M];
        for (int i = 0; i < M; i++) {
            location[i] = scanner.nextInt();
        }
        System.out.print(solution());
    }

    static int solution() {
        int lt = 1, rt = N;
        int answer = N;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (check(mid)) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }

        return answer;
    }

    static boolean check(int mid) {
        int prev = 0;
        for (int location : location) {
            if (prev < location - mid) return false;
            prev = location + mid;
        }

        return prev >= N;
    }
}