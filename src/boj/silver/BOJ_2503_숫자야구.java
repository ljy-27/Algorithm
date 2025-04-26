package boj.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2503_숫자야구 {

    private int solution(int n, int[][] arr) {
        int answer=0;
        int a,b,c;
        for (a=1; a<10; a++){
            for (b=1; b<10; b++){
                for (c=1; c<10; c++){
                    if (a==b || b==c || a==c){
                        continue;
                    }

                    int cnt = 0;

                    for (int[] ints : arr) {
                        int ball_cnt = 0;
                        int strike_cnt = 0;

                        int num = ints[0];
                        int strike = ints[1];
                        int ball = ints[2];

                        ArrayList<Integer> list = new ArrayList<>();
                        while(num>0){
                            list.add(num % 10);
                            num /= 10;
                        }

                        Integer c1 = list.get(0);
                        Integer b1 = list.get(1);
                        Integer a1 = list.get(2);

                        if (a == a1){
                            strike_cnt++;
                        }
                        if (b == b1){
                            strike_cnt++;
                        }
                        if (c == c1){
                            strike_cnt++;
                        }

                        if (a == b1 || a == c1){
                            ball_cnt++;
                        }
                        if (b == a1 || b == c1){
                            ball_cnt++;
                        }
                        if (c == b1 || c == a1){
                            ball_cnt++;
                        }

                        if (strike_cnt != strike){
                            break;
                        }
                        if (ball_cnt != ball){
                            break;
                        }
                        cnt++;
                    }
                    if (cnt == n){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BOJ_2503_숫자야구 T = new BOJ_2503_숫자야구();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        for (int i=0; i<n; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}