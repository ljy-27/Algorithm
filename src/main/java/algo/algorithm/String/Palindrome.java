package algo.algorithm.String;

import java.util.Scanner;

public class Palindrome {

    private String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            return "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Palindrome T = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
