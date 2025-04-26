package programmers.lv1;

import java.util.*;

class Programmers_크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int answer = 0;

        for (int x : moves) {
            int temp = 0;
            for (int i=0; i<board.length; i++) {
                if (board[i][x-1]!=0) {
                    temp = board[i][x-1];
                    board[i][x-1]=0;
                    break;
                }
            }
            if (!basket.isEmpty() && basket.peek()==temp) {
                basket.pop();
                answer+=2;
            } else if (temp ==0) continue;
            else basket.push(temp);
        }

        return answer;
    }
}