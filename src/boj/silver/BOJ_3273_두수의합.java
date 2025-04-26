package boj.silver;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_3273_두수의합 {

    public static void main(String[] args) {
        BOJ_3273_두수의합 T = new BOJ_3273_두수의합();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(T.solution(n,arr,target));
    }

    private int solution(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int lt=0, rt = n-1;
        int cnt=0;
        while (lt<rt) {
            if (arr[lt] + arr[rt] ==target) cnt++;
            if (arr[lt] + arr[rt]>=target) rt--;
            else lt++;
        }
        return cnt;
    }
}