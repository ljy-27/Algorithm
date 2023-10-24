package algo.algorithm.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Saving_Princess {

    public int solution(int n, int k){
        int answer=0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) queue.offer(i);
        while (queue.size()>1){
            for (int i=0; i<k-1; i++) queue.offer(queue.poll());
            queue.poll();
        }
        answer= queue.poll();
        return answer;
    }

    public static void main(String[] args) {
        Saving_Princess T = new Saving_Princess();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.print(T.solution(n,k));
    }
}
