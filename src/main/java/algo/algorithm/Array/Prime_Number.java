package algo.algorithm.Array;

import java.util.Scanner;

public class Prime_Number {

    private int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for(int i=2; i<n+1; i++){
            if(arr[i] == 0){
                answer++;
                for(int j=i; j<n+1; j+=i){
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Prime_Number T = new Prime_Number();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(T.solution(n));
    }
}
