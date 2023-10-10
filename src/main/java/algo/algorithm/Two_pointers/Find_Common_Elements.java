package algo.algorithm.Two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Find_Common_Elements {

    public ArrayList<Integer> solution(int n1, int [] arr1, int n2, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1=0, p2=0;
        while (p1<n1 && p2<n2){
            if (arr1[p1]<arr2[p2]){
                p1++;
            }else if (arr1[p1]>arr2[p2]) {
                p2++;
            }else {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Find_Common_Elements T = new Find_Common_Elements();
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0; i<n1; i++){
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0; i<n2; i++){
            arr2[i] = scanner.nextInt();
        }
        for (Integer x : T.solution(n1, arr1, n2, arr2)) {
            System.out.print(x + " ");
        }
    }
}
