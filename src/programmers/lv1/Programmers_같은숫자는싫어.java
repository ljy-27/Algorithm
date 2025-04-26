package programmers.lv1;

import java.util.*;

public class Programmers_같은숫자는싫어 {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();

        int arrSize = arr.length;
        for(int i=arrSize-1; i>=0; i--) {
            if (i==arrSize-1) stack.push(arr[i]);
            else if (stack.peek()!=arr[i]) stack.push(arr[i]);
        }

        int stackSize = stack.size();
        int[] answer = new int[stackSize];
        for (int j=0; j<stackSize; j++) {
            answer[j]=stack.pop();
        }

        return answer;
    }
}