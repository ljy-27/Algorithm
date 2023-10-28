package algo.algorithm.Sorting_Searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicate_Check {

    public char solution(int n, int[] arr){
        char answer = 'U';
        Arrays.sort(arr);
        for (int i=0; i<n-1; i++){
            if (arr[i]==arr[i+1]) return 'D';
        }
        return answer;
    }

    public static void main(String[] args) {
        Duplicate_Check T = new Duplicate_Check();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }

    public char solution2(int n, int[] arr){
        char answer = 'U';
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if (map.get(arr[i])==2) return 'D';
        }
        return answer;
    }
}
