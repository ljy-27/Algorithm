package boj.gold;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_19942_다이어트 {

    public static int n;
    public static int[][] ingredient;
    public static boolean[] visited;
    public static int answer = Integer.MAX_VALUE;
    public static List<Integer> answers = new ArrayList<>();
    public static int mp;
    public static int mf;
    public static int ms;
    public static int mv;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        mp = scanner.nextInt();
        mf = scanner.nextInt();
        ms = scanner.nextInt();
        mv = scanner.nextInt();
        ingredient = new int[n][5];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                ingredient[i][j] = scanner.nextInt();
            }
        }
        DFS(0,0,0,0,0,0);
        if (answer != Integer.MAX_VALUE) {
            System.out.println(answer);
            for (int i: answers) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

    public static void DFS(int depth, int p, int f, int s, int v, int price) {
        if (p>=mp && f>=mf && s>=ms && v>=mv && answer>price) {
            answer = price;
            answers.clear();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    answers.add(i+1);
                }
            }
        }
        if (depth == n) return;

        visited[depth]= true;
        DFS(depth+1, p+ingredient[depth][0], f+ingredient[depth][1], s+ingredient[depth][2], v+ingredient[depth][3], price+ingredient[depth][4]);
        visited[depth]= false;
        DFS(depth+1, p, f, s, v, price);
    }
}