package boj.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309_일곱난쟁이 {

    public void solution(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();
        int sum = Arrays.stream(arr).sum();
        int answer = sum - 100;
        int[] check = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == answer) {
                    check[0] = i;
                    check[1] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == check[0] || i == check[1]) {
                System.out.print("");
            }
            else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        BOJ_2309_일곱난쟁이 T = new BOJ_2309_일곱난쟁이();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        T.solution(arr);
    }
}