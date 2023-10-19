package algo.algorithm.HashMap_TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K_Number {

    public int solution(int n, int k, int[] arr){
        int answer=-1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int l=j+1; l<n; l++){
                    treeSet.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        for (Integer i : treeSet) {
            cnt++;
            if (cnt==k) return i;
        }
        return answer;
    }

    public static void main(String[] args) {
        K_Number T = new K_Number();
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
