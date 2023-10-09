package algo.algorithm.Two_pointers;

import java.util.Scanner;

public class Combine_Two_Arrays {

    public int[] solution(int n1, int[] arr1, int n2, int[] arr2){
        int[] answer = new int[(n1 + n2)];
        int p1=0, p2=0;
        int cnt=0;
        while (p1<n1 && p2<n2){
            if(arr1[p1]<arr2[p2]){
                answer[cnt] = arr1[p1];
                p1++;
                cnt++;
            }else if (arr1[p1]>arr2[p2]){
                answer[cnt] = arr2[p2];
                p2++;
                cnt++;
            }else {
                answer[cnt] = arr1[p1];
                p1++;
                cnt++;
            }
        }
        if (p1==n1){
            for (int i=p2; i<n2; i++){
                answer[cnt] = arr2[i];
                cnt++;
            }
        } else if (p2==n2) {
            for (int i=p1; i<n1; i++){
                answer[cnt] = arr1[i];
                cnt++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Combine_Two_Arrays T = new Combine_Two_Arrays();
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
        for (int i : T.solution(n1, arr1, n2, arr2)) {
            System.out.print(i+" ");
        }
    }
}
