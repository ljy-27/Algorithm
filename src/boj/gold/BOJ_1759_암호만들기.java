package boj.gold;

import java.util.*;

class BOJ_1759_암호만들기 {

    static int L, C;
    static char[] arr;
    static char[] answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        L = scanner.nextInt();
        C = scanner.nextInt();
        arr = new char[C];
        answer = new char[L];
        for (int i = 0; i < C; i++) {
            arr[i] = scanner.next().charAt(0);
        }
        Arrays.sort(arr);
        DFS(0, 0, 0, 0);
    }

    public static void DFS(int depth, int index, int consonant, int vowel) {
        if (depth == L) {
            if (consonant >= 2 && vowel >= 1) {
                for (char c : answer) {
                    System.out.print(c);
                }
                System.out.println();
            }
            return;
        }

        for (int i = index; i < C; i++) {
            answer[depth] = arr[i];
            if (isVowel(arr[i])) {
                DFS(depth + 1, i + 1, consonant, vowel + 1);
            } else {
                DFS(depth + 1, i + 1, consonant + 1, vowel);
            }
        }
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}