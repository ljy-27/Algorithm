package algo.algorithm.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Iron_Rod {

    public int solution(String str){
        int answer=0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++){
            char tmp = str.charAt(i);
            if (tmp=='(') stack.push(tmp);
            else if (tmp == ')' && str.charAt(i-1)=='(') {
                stack.pop();
                answer+=stack.size();
            } else {
                stack.pop();
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Iron_Rod T = new Iron_Rod();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
