package boj.silver;

import java.util.*;

public class BOJ_9012_괄호 {

    private void solution(int n, String[] arr) {

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<arr[i].length(); j++) {
                if (arr[i].charAt(j)==')' && !stack.isEmpty() && stack.peek()=='(') stack.pop();
                else stack.push(arr[i].charAt(j));
            }
            if (stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
            stack.clear();
        }
    }

    public static void main(String[] args) {
        BOJ_9012_괄호 T = new BOJ_9012_괄호();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        T.solution(n,arr);
    }
}