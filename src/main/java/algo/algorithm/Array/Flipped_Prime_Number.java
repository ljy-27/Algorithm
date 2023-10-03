package algo.algorithm.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Flipped_Prime_Number {

    public boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int x: arr){
            int tmp = x;
            int result = 0;
            while (tmp>0){
                int tmp1 = tmp%10;
                result = result*10 +tmp1;
                tmp = tmp/10;
                }
            if(isPrime(result)){
                answer.add(result);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Flipped_Prime_Number T = new Flipped_Prime_Number();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for (Integer i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
