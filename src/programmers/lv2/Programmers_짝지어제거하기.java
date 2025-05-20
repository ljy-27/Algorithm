package programmers.lv2;

import java.util.*;

class Programmers_짝지어제거하기 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }

        return stack.isEmpty() ? 1 : 0;
    }
}