package algo.algorithm.Two_pointers;

import java.util.Scanner;

public class Sum_Consecutive_Numbers2 {

    public int solution(int n){
        int answer=0;
        int cnt=1;
        n--;
        while (n>0){
            cnt++;
            n-=cnt;
            if (n%cnt==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sum_Consecutive_Numbers2 T = new Sum_Consecutive_Numbers2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(T.solution(n));
    }
}
