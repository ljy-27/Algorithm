package boj.bronze;

import java.util.*;

class BOJ_2480_주사위세개 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(solution(arr));
    }

    static int solution(int[] arr) {
        if (arr[0]==arr[1] && arr[1]==arr[2]) return 10000 + (arr[0]*1000);
        else if (arr[0]==arr[1] || arr[1]==arr[2]) return 1000 + arr[1]*100;
        else return arr[2]*100;
    }
}