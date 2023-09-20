package algo.algorithm.Array;

import java.util.Scanner;

public class Case_Conversion {

    public String solution(String str){
        String answer="";
        for (char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer+=Character.toUpperCase(x);
            }
            else {
                answer+=Character.toLowerCase(x);
            }
        }
//        for(char x : str.toCharArray()){
//            if(x>=65 && x<=90){
//                answer+=(char)(x+32);
//            }
//            else {
//                answer+=(char)(x-32);
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        Case_Conversion T = new Case_Conversion();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
