package algo.algorithm.Array;

import java.util.Scanner;

public class Maximum_Grid {

    public int solution(int n, int[][] grid){
        int answer = 0;
        int diagonal = 0;
        int diagonal1 = 0;
        for(int i=0; i<n; i++){
            int row=0, colum=0;
            for(int j=0; j<n; j++){
                row += grid[i][j];
                colum +=grid[j][i];
            }
            answer = Math.max(answer, row);
            answer = Math.max(answer, colum);
        }
        for(int i=0; i<n; i++){
            diagonal += grid[i][i];
            diagonal1 += grid[i][n-1-i];
        }
        answer = Math.max(answer, diagonal);
        answer = Math.max(answer, diagonal1);
        return answer;
    }

    public static void main(String[] args) {
        Maximum_Grid T = new Maximum_Grid();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = scanner.nextInt();
            }
        }
        System.out.print(T.solution(n, grid));
    }
}
