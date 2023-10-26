package algo.algorithm.Sorting_Searching;

import java.util.Scanner;

public class Bubble_Sort {

    private int[] solution(int n, int[] arr) {
        int[] answer=arr;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Bubble_Sort T = new Bubble_Sort();
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
