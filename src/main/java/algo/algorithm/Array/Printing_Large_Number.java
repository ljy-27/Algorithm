package algo.algorithm.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Printing_Large_Number {

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if (arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Printing_Large_Number T = new Printing_Large_Number();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
