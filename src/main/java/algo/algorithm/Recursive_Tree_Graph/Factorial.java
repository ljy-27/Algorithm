package algo.algorithm.Recursive_Tree_Graph;

public class Factorial {

    public int factorial(int n){
        if (n==1) return 1;
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial T = new Factorial();
        System.out.print(T.factorial(5));
    }
}
