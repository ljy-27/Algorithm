package boj.gold;

import java.util.Scanner;

public class BOJ_2467_용액 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] answer = solution(n, arr);
        for (int i = 0; i < 2; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static int[] solution(int n, int[] arr) {
        int lt =0, rt = n-1;
        int min = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            int temp = Math.abs(sum);

            if (temp < min) {
                min = temp;
                answer[0] = arr[lt];
                answer[1] = arr[rt];
            }

            if (sum > 0) rt--;
            else lt++;
        }

        return answer;
    }
}