package algo.algorithm.String;

import java.util.ArrayList;
import java.util.Scanner;

public class Flip_The_Word {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }


    public static void main(String[] args) {
        Flip_The_Word T = new Flip_The_Word();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scanner.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }

    public ArrayList<String> solution2(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x :  str){
            char[] chars = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(chars);
            answer.add(tmp);
        }
        return answer;
    }
}
