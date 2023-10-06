package algo.algorithm.Array;

import java.util.Scanner;

public class Mountaintop {

    public int solution(int n, int[][] arr){
        int answer = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int i1 = i+dx[k];
                    int j1 = j+dy[k];
                    if(0<=i1 && 0<=j1 && i1<n && j1<n && arr[i][j] <= arr[i1][j1]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Mountaintop T = new Mountaintop();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
