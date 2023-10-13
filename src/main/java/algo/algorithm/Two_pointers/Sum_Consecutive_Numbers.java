package algo.algorithm.Two_pointers;

import java.util.Scanner;

public class Sum_Consecutive_Numbers {

    public int solution(int n){
        int answer=0;
        int sum=0;
        int lt=1;
        for (int rt=1; rt<=(n/2)+1; rt++){
            sum+=rt;
            if (sum == n) {answer++;}
            while (sum >= n){
                sum -= lt++;
                if (sum == n) {answer++;}
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sum_Consecutive_Numbers T = new Sum_Consecutive_Numbers();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(T.solution(n));
    }
}
