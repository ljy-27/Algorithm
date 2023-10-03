package algo.algorithm.Array;

import java.util.Scanner;

public class Calculation_Score {

    public int solution(int n, int[] arr){
        int answer = 0, tmp = 0;
        for (int i : arr) {
            if(i==1){
                tmp++;
                answer+=tmp;
            }else {
                tmp=0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Calculation_Score T = new Calculation_Score();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
