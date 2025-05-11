package boj.bronze;

import java.util.Scanner;

public class BOJ_2231_분해합 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = solution(n);
        System.out.println(answer);
    }

    public static int solution(int n) {
        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum+i == n) {
                return i;
            }
        }
        return 0;
    }
}