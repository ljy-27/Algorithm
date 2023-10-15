package algo.algorithm.Two_pointers;

import java.util.Scanner;

public class Maximum_Length_Continuous_Subsequence {

    public int solution(int n, int k, int[] arr){
        int answer=0;
        int cnt=0;
        int lt=0;
        for (int rt=0; rt<n; rt++){
            if (arr[rt]==0) cnt++;
            while (cnt>k){
                if (arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Maximum_Length_Continuous_Subsequence T = new Maximum_Length_Continuous_Subsequence();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n,k,arr));
    }
}
