package algo.algorithm.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public int solution(String str){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) stack.push(Character.getNumericValue(c));
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (c=='+') stack.push(lt+rt);
                else if (c=='-') stack.push(lt-rt);
                else if (c=='*') stack.push(lt*rt);
                else if (c=='/') stack.push(lt/rt);
            }
        }
        answer=stack.pop();
        return answer;
    }

    public static void main(String[] args) {
        Postfix T = new Postfix();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
