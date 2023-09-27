package algo.algorithm.String;

import java.util.ArrayList;
import java.util.Scanner;

public class Character_Distance {

    private int[] solution(String str, char target) {
        int[] answer = new int[str.length()];
        int dis = 1000;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == target){
                dis = 0;
                answer[i] = dis;
            } else {
                answer[i] = ++dis;
            }
        }
        dis = 1000;
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) == target){
                dis = 0;
            } else {
                dis++;
                answer[i] = Math.min(answer[i], dis);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Character_Distance T = new Character_Distance();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char x = scanner.next().charAt(0);
        for (int i : T.solution(str, x)){
            System.out.print(i + " ");
        }
    }
}