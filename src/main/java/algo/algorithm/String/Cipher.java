package algo.algorithm.String;

import java.util.Scanner;

public class Cipher {

    public String solution(String str, int n){
        String answer = "";
        String tmp = "";
        for(int i = 0; i<n; i++){
            for (int o = 0; o<7; o++){
                if(str.charAt(7*i + o)=='#'){
                    tmp+=1;
                } else {
                    tmp+=0;
                }
            }
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            tmp="";
        }


        return answer;
    }

    public static void main(String[] args) {
        Cipher T = new Cipher();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(str, n));
    }

    public String solution2(String str, int n){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp = str.substring(0,7).replace('#', '1')
                    .replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer+=(char)num;
            str=str.substring(7);
        }
        return answer;
    }
}
