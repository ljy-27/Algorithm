package algo.algorithm.Sorting_Searching;

import java.util.Scanner;

public class Insertion_Sort {

    public int[] solution(int n, int[] arr){
        for (int i=1; i<n; i++){
            int tmp=arr[i],j;
            for (j=i-1; j>=0; j--){
                if (arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Insertion_Sort T = new Insertion_Sort();
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
//5 7 11 6