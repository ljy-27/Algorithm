package boj.gold;

import java.util.*;

public class BOJ_1806_부분합{

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(solution(arr,S));
    }

    static int solution(int[] arr, int S) {
        int lt=0, rt=0;
        int sum=0;
        int answer=Integer.MAX_VALUE;
        while (true) {
            if (sum >= S) {
                answer = Math.min(answer, rt-lt);
                sum -= arr[lt++];
            }
            else if (rt == arr.length) break;
            else sum += arr[rt++];
        }
        return (answer==Integer.MAX_VALUE) ? 0 : answer;
    }
}