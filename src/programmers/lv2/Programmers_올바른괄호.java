package programmers.lv2;

import java.util.*;

class Programmers_올바른괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='(') stack.pop();
            else stack.push(s.charAt(i));
        }

        if (stack.isEmpty()) return true;
        else return false;
    }
}