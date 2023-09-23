package algo.algorithm.String;

import java.util.Scanner;

public class Remove_Duplicate_Characters {

    public String solution(String str){
        String answer = "";
//        char[] chars = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i){
//                answer += chars[i];
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Remove_Duplicate_Characters T = new Remove_Duplicate_Characters();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
