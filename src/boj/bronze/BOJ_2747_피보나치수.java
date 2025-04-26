package boj.bronze;

import java.util.Scanner;

public class BOJ_2747_피보나치수 {

    static int[] check;
    private int solution(int n) {
        return DFS(n);
    }

    public int DFS(int n) {
        if (check[n] > 0) return check[n];
        else if (n == 0) return check[0]=0;
        else if (n == 1) return check[1]=1;
        else return check[n] = DFS(n-1) + DFS(n-2);
    }

    public static void main(String[] args) {
        BOJ_2747_피보나치수 T = new BOJ_2747_피보나치수();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        check = new int[n+1];
        System.out.print(T.solution(n));
    }
}