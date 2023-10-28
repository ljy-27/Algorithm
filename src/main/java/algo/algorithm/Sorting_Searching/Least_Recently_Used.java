package algo.algorithm.Sorting_Searching;

import java.util.Scanner;

public class Least_Recently_Used {

    public int[] solution(int size, int[] arr){
        int[] cache = new int[size];
        for (int x : arr) {
            int pos=-1;
            for (int i=0; i<size; i++){
                if (x==cache[i]) pos=i;
            }
            if (pos==-1){
                for (int i=size-1; i>0; i--){
                    cache[i]=cache[i-1];
                }
            }else {
                for (int i=pos; i>0; i--){
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Least_Recently_Used T = new Least_Recently_Used();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        for (int i : T.solution(s,arr)) {
            System.out.print(i+" ");
        }
    }
}



