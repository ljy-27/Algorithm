package algo.algorithm.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Claw_Machine {

    public int solution(int[][] board, int[] moves){
        int answer=0;
        Stack<Integer> basket = new Stack<>();
        for (int i : moves) {
            for (int j=0; j< board.length; j++){
                if (board[j][i-1]!=0){
                    if (basket.isEmpty()) basket.push(board[j][i-1]);
                    else if (basket.peek() == board[j][i-1]) {
                        basket.pop();
                        answer+=2;
                    }else basket.push(board[j][i-1]);
                    board[j][i-1]=0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Claw_Machine T = new Claw_Machine();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j]=scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i=0; i<m; i++){
            moves[i]=scanner.nextInt();
        }
        System.out.print(T.solution(board,moves));
    }
}
