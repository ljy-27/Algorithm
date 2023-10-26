package algo.algorithm.Sorting_Searching;

import java.util.Scanner;

public class Selection_Sort {

    public int[] solution(int n, int[] arr){
        int[] answer=arr;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Selection_Sort T = new Selection_Sort();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        for (int i : T.solution(n, arr)) {
            System.out.print(i+" ");
        }
    }
}
