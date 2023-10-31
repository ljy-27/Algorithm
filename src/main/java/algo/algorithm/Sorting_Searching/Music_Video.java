package algo.algorithm.Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Music_Video {

    public int count(int[] arr, int capacity){
        int cnt = 1, sum=0;
        for (int x : arr) {
            sum+=x;
            if (sum>capacity){
                cnt++;
                sum=x;
            }
        }
        return cnt;
    }

    private int solution(int m, int[] arr) {
        int answer=0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt<=rt){
            int mid = (lt+rt)/2;
            if (count(arr, mid)<=m){
                answer = mid;
                rt = mid-1;
            } else lt = mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Music_Video T = new Music_Video();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= scanner.nextInt();
        }
        System.out.print(T.solution(m,arr));
    }
}
