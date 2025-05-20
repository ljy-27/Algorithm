package boj.silver;

import java.util.Scanner;

public class BOJ_14501_퇴사 {
    static int N;
    static int[] T, P;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = new int[N];
        P = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        DFS(0, 0);
        System.out.println(answer);
    }

    static void DFS(int day, int money) {
        if (day == N) {
            answer = Math.max(answer, money);
            return;
        }
        DFS(day + 1, money);
        if(day + T[day]<=N) {
            DFS(day + T[day], money + P[day]);
        }
    }
}

class BOJ_14501_퇴사_TopDownDP {
    static int N;
    static int[] T, P;
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = new int[N];
        P = new int[N];
        dp = new Integer[N];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        System.out.println(solve(0));
    }

    static int solve(int day) {
        if (day >= N) return 0;

        if (dp[day] != null) return dp[day];

        int notTake = solve(day + 1);

        int take = 0;
        if (day + T[day] <= N) {
            take = P[day] + solve(day + T[day]);
        }

        return dp[day] = Math.max(take, notTake);
    }
}

class BOJ_14501_퇴사_BottomUpDP {
    static int N;
    static int[] T, P, dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = new int[N];
        P = new int[N];
        dp = new int[N + 1];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        for (int day = N - 1; day >= 0; day--) {
            int next = day + T[day];
            if (next <= N) {
                dp[day] = Math.max(dp[day + 1], P[day] + dp[next]);
            } else {
                dp[day] = dp[day + 1];
            }
        }

        System.out.println(dp[0]);
    }
}