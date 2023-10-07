package algo.algorithm.Array;

import java.util.Scanner;

public class Decide_Interim_Leader {

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
        Decide_Interim_Leader T = new Decide_Interim_Leader();
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
