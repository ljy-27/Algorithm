package algo.algorithm.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Remove_Parenthesis {

    public String solution(String str){
        String answer="";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c==')'){
                while (stack.pop()!='(');
            }
            else stack.push(c);
        }
        for (Character c : stack) {
            answer+=c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Remove_Parenthesis T = new Remove_Parenthesis();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
