package algo.algorithm.Array;

import java.util.Scanner;

public class Find_Rank {

    private int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i=0; i<n; i++){
            int tmp=1;
            for (int x : arr) {
                if(arr[i] < x){
                    tmp++;
                }
            }
            answer[i]=tmp;
        }
        return answer;
    }

    public static void main(String[] args) {
        Find_Rank T = new Find_Rank();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
