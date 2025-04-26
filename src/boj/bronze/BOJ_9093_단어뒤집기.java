package boj.bronze;

import java.util.Scanner;

public class BOJ_9093_단어뒤집기 {

    private void solution(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            String[] s = string.split(" ");
            for(String str : s) {
                StringBuilder reverse = new StringBuilder(str).reverse();
                str = reverse.toString();
                System.out.print(str+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BOJ_9093_단어뒤집기 T = new BOJ_9093_단어뒤집기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        T.solution(strings);
    }
}