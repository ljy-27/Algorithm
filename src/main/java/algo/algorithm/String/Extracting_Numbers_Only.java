package algo.algorithm.String;

import java.util.Scanner;

public class Extracting_Numbers_Only {

    public int solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Extracting_Numbers_Only T = new Extracting_Numbers_Only();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }

    public int solution2(String str){
        int answer = 0;
        for(char x : str.toCharArray()){
            if(x>=48 && x<=57){
                answer += answer*10 + (x-48);
            }
        }

        return answer;
    }
}
