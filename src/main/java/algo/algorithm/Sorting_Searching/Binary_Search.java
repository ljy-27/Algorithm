package algo.algorithm.Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

    private int solution(int n, int m, int[] arr) {
        int answer=0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while (rt>=lt){
            int mid=(lt+rt)/2;
            if (arr[mid]==m) return mid+1;
            else if (arr[mid]>m) rt=mid-1;
            else lt=mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Binary_Search T = new Binary_Search();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print(T.solution(n,m,arr));
    }
}
