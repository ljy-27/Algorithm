package programmers.lv2;

import java.util.*;

class Programmers_괄호회전하기 {
    public int solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int answer = 0;

        for (int i=0; i<s.length(); i++) {
            for (int j=i; j<i + s.length(); j++) {
                int k = j % s.length();
                if (!stack.isEmpty() && pair(stack.peekFirst(), s.charAt(k))) {
                    stack.removeFirst();
                } else {
                    stack.addFirst(s.charAt(k));
                }
            }
            if (stack.isEmpty()) answer++;
            else stack.clear();
        }

        return answer;
    }

    boolean pair(char peek, char cur) {
        if (peek == '[' &&  cur == ']'
                || peek == '{' && cur == '}'
                || peek == '(' && cur == ')') {
            return true;
        } else return false;
    }
}