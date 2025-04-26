package boj.silver;

import java.util.Scanner;

public class BOJ_2559_수열 {

    private int solution(int len, int stride, int[] arr) {
        int[] sumarr = new int[len];
        sumarr[0] = arr[0];
        for (int i = 1; i < len; i++) {
            sumarr[i] = sumarr[i-1] + arr[i];
        }
        int answer = sumarr[stride-1];
        for (int i = stride; i < len; i++) {
            int tmp = sumarr[i] - sumarr[i-stride];
            answer = Math.max(answer, tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int stride = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        BOJ_2559_수열 T = new BOJ_2559_수열();
        System.out.println(T.solution(len, stride, arr));
    }
}