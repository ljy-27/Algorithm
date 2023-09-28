package algo.algorithm.String;

import java.util.Scanner;

public class String_Compression {

    public String solution(String str){
        String answer = "";
        str = str + " ";
        int stack=1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                stack++;
            } else {
                if(stack==1){
                    answer+=str.charAt(i);
                }else {
                    answer = answer + str.charAt(i) + stack;
                    stack = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String_Compression T = new String_Compression();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
