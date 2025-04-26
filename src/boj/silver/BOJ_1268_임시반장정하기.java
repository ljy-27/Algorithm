package boj.silver;

import java.util.Scanner;

public class BOJ_1268_임시반장정하기 {

    public int solution(int n, int[][] arr){
        int answer=0;
        int max=0;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                for(int k=0; k<5; k++){
                    if(arr[i][k]==arr[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if(count>max){
                max=count;
                answer=i+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BOJ_1268_임시반장정하기 T = new BOJ_1268_임시반장정하기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }
}