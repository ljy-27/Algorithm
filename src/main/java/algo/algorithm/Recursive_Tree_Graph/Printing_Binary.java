package algo.algorithm.Recursive_Tree_Graph;

public class Printing_Binary {

    public void DFS(int n){
        if (n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        Printing_Binary T = new Printing_Binary();
        T.DFS(11);
    }
}
