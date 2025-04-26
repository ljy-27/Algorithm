package programmers.lv3;

import java.util.LinkedList;
import java.util.Queue;

class Programmers_네트워크 {
    static int[][] static_computers;
    static boolean[] visited;

    public int solution(int n, int[][] computers) {
        static_computers = computers;
        visited = new boolean[n];
        int answer = 0;

        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                DFS(i);
                answer++;
            }
        }

        return answer;
    }

    public static void DFS(int computerNum) {
        visited[computerNum]=true;
        for (int i=0; i<static_computers.length; i++) {
            if (i==computerNum) continue;
            if (static_computers[computerNum][i]==1 && !visited[i]) {
                DFS(i);
            }
        }
        return;
    }
}

//BFS
/*
import java.util.*;

class Solution {
    static Queue<Integer> que = new LinkedList<>();
    static int[] check;
    public int solution(int n, int[][] computers) {
        check = new int[n];
        int answer = 0;
        for (int i=0; i<n; i++) {
            if(check[i]==0) {
                BFS(i, n, computers);
                answer++;
            }
        }
        return answer;
    }
    public void BFS(int i, int n, int[][] computers) {
        que.add(i);
        while(!que.isEmpty()){
            int cur = que.poll();
            for(int j=0; j<n; j++) {
                if(cur!=j && check[j]==0 && computers[cur][j]==1){
                    que.add(j);
                    check[j]=1;
                }
            }
        }
    }
}
 */