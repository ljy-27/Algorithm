package algo.algorithm.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Rock_Paper_Scissor {

    public char[] solution(int n, int[] a, int[] b){
        char[] result = new char[n];
        for(int i=0; i<n; i++){
            if(a[i] == b[i]){
                result[i] = 'D';
            } else if (a[i] == 1 && b[i] == 3){
                result[i] = 'A';
            } else if (a[i] == 2 && b[i] == 1) {
                result[i] = 'A';
            } else if (a[i] == 3 && b[i] == 2) {
                result[i] = 'A';
            } else {
                result[i] = 'B';
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Rock_Paper_Scissor T = new Rock_Paper_Scissor();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = scanner.nextInt();
        }
        for (char c : T.solution(n,a,b)) {
            System.out.println(c);
        }
    }
}
