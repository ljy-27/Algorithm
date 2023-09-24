package algo.algorithm.String;

import java.util.Scanner;

public class PalindromeString {

    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i = 0; i< len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return "NO";
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        PalindromeString T = new PalindromeString();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }

    public String solution2(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            return "YES";
        }
        return answer;
    }
}
