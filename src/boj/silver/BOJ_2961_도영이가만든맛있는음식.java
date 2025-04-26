package boj.silver;

import java.util.Scanner;

public class BOJ_2961_도영이가만든맛있는음식 {

    static int n;
    static int[][] ingredient;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ingredient = new int[n][2];
        for (int i=0; i<n; i++){
            ingredient[i][0] = scanner.nextInt();
            ingredient[i][1] = scanner.nextInt();
        }
        DFS(0,1,0,0);
        System.out.println(answer);
    }

    public static void DFS(int depth, int sour, int salty, int used){
        if (depth==n){
            if (used==0) return;
            else {
                answer = Math.min(answer, Math.abs(sour - salty));
                return;
            }
        }
        DFS(depth+1, sour*ingredient[depth][0], salty+ingredient[depth][1], used+1);
        DFS(depth+1, sour, salty, used);
    }
}