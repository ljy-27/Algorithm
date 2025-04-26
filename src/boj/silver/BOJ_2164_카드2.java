package boj.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2164_카드2 {
    public static void main(String[] args) {
        BOJ_2164_카드2 T = new BOJ_2164_카드2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(T.solution(n));
    }

    private int solution(int n) {
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }
        while (que.size() > 1) {
            que.poll();
            int top = que.poll();
            que.offer(top);
        }
        return que.poll();
    }
}