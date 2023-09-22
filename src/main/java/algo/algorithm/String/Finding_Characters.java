package algo.algorithm.String;

import java.util.Scanner;

public class Finding_Characters {

    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t){
//                answer++;
//            }
//        }
        for(char x : str.toCharArray()){
            if(x == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Finding_Characters T = new Finding_Characters();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(T.solution(str, c));
    }

}
