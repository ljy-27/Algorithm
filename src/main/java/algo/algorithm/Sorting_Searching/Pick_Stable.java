package algo.algorithm.Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Pick_Stable {

    public int count(int mid, int[] arr){
        int cnt=1;
        int ep=arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]-ep>=mid){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int h, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt= 1;
        int rt = arr[n-1];
        while (lt<=rt){
            int mid = (lt+rt)/2;
            if (count(mid, arr)>=h){
                answer=mid;
                lt=mid+1;
            }else rt=mid-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Pick_Stable T = new Pick_Stable();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print(T.solution(n, h, arr));
    }
}
