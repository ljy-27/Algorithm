package algo.algorithm.Two_pointers;

import java.util.Scanner;

public class Continuous_Partial_Sequence {

    public int solution(int n, int m, int[] arr){
        int answer=0;
        int sum=0;
        int lt=0;
        for (int rt=0; rt<n; rt++){
            sum += arr[rt];
            if (sum==m) {answer++;}
            while (sum>=m){
                sum-=arr[lt++];
                if (sum==m){ answer++; }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Continuous_Partial_Sequence T = new Continuous_Partial_Sequence();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n,m,arr));
    }
}
