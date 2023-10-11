package algo.algorithm.Two_pointers;

import java.util.Scanner;

public class Maximum_Sales {

    public int solution(int days, int during, int[] sales){
        int answer=0;
        int sum = 0;
        for (int i=0; i<during; i++){
            sum+=sales[i];
        }
        answer=sum;
        for (int i=during; i<days; i++){
            sum = sum + sales[i] - sales[i-during];
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Maximum_Sales T = new Maximum_Sales();
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int during = scanner.nextInt();
        int[] sales = new int[days];
        for (int i=0; i<days; i++){
            sales[i] = scanner.nextInt();
        }
        System.out.print(T.solution(days, during, sales));
    }
}