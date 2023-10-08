package algo.algorithm.Array;

import java.util.Scanner;

public class Mentoring {

    public int solution(int n, int m, int[][] arr){
        int answer = 0;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){//i, j는 학생 번호
                if (i!=j){
                    int cnt=0;
                    for (int k=0; k<m; k++){//k는 test
                        int rankI=0, rankJ=0;
                        for (int s=0; s<n; s++){//s는 등수
                            if (arr[k][s] == i) {rankI=s;}
                            if (arr[k][s] == j) {rankJ=s;}
                        }
                        if (rankI<rankJ) {cnt++;}
                    }
                    if (cnt == m) {answer++;}
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Mentoring T = new Mentoring();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
