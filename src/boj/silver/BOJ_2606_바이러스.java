package boj.silver;

import java.util.Scanner;

public class BOJ_2606_바이러스 {

    static int n, m;
    static int answer = 0;
    static int[][] arr;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n+1][n+1];
        check = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        DFS(1);

        System.out.print(answer-1);
    }

    static void DFS(int num) {
        check[num] = true;
        answer++;

        for (int i = 1; i <= n; i++) {
            if (arr[num][i] == 1 && !check[i]) {
                DFS(i);
            }
        }
    }
}