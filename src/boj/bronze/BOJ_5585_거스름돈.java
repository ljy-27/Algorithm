package boj.bronze;

import java.util.Scanner;

public class BOJ_5585_거스름돈 {

    static int[] arr = {500, 100, 50, 10, 5};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        int change = 1000 - n;
        for (int i : arr) {
            if (change >= i) {
                answer += change / i;
                change = change % i;
            }
        }

        return answer + change;
    }
}