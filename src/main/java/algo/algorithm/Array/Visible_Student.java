package algo.algorithm.Array;

import java.util.Scanner;

public class Visible_Student {

    public int solution(int n, int[] arr){
        int answer = 0;
        int max = 0;
        for(int x : arr){
            if(x>max){
                answer++;
                max = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Visible_Student T = new Visible_Student();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
