package algo.algorithm.Recursive_Tree_Graph;

import java.util.Scanner;

public class Fibonacci {
    static int[] fibo;
    public int fibonacci(int n){
        if (fibo[n]>0) return fibo[n];
        if (n==1) return fibo[n]=1;
        else if (n==2) return fibo[n]=1;
        else return fibo[n] = fibonacci(n-2)+fibonacci(n-1);
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibo = new int[n+1];
        T.fibonacci(n);
        for (int i=1; i<=n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }
}
