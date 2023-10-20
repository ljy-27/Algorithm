package algo.algorithm.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Correct_Parentheses {

    public String solution(String str){
        String answer="YES";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c=='(') stack.push(c);
            else if (c==')'&& stack.isEmpty()) return "NO";
            else stack.pop();
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Correct_Parentheses T = new Correct_Parentheses();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
