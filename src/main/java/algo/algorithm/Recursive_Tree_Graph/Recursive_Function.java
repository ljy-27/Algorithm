package algo.algorithm.Recursive_Tree_Graph;

public class Recursive_Function {

    public void recursion(int n){
        if (n==0) return;
        else {
            recursion(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Recursive_Function T = new Recursive_Function();
        T.recursion(3);
    }
}
