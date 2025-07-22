package boj.silver;

import java.util.Scanner;

public class BOJ_2018_수들의합5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(solution(n));
    }

    public static int solution(int n) {
        int lt = 1, rt = 1;
        int sum = 1;
        int answer = 0;
        while (lt <= n) {
            if (sum < n) sum += ++rt;
            else if (sum > n) sum -= lt++;
            else {
                answer++;
                sum -= lt++;
            }
        }
        return answer;
    }
}