package algo.algorithm.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Finding_calf {
    int[] dis = {1,-1,5};
    int [] check = new int[10001];
    Queue<Integer> queue = new LinkedList<>();
    public int BFS(int hs, int calf){
        check[hs]=1;
        queue.offer(hs);
        int L = 0;
        while (!queue.isEmpty()){
            int len = queue.size();

            for (int i=0; i<len; i++){
                int poll = queue.poll();
                for (int j=0; j<dis.length; j++){
                    int next = poll+dis[j];
                    if (next==calf) return L+1;
                    if (next>=1 && next<=10000 && check[next]==0){
                        check[next]=1;
                        queue.offer(next);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Finding_calf T = new Finding_calf();
        Scanner scanner = new Scanner(System.in);
        int hs = scanner.nextInt();
        int calf = scanner.nextInt();
        System.out.print(T.BFS(hs, calf));
    }
}
