package programmers.lv2;

import java.util.*;

class Programmers_게임맵최단거리 {
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};

    public int solution(int[][] maps) {
        return BFS(maps);
    }

    public int BFS(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{0,0,1}); //y,x,level
        maps[0][0]=0;

        while(!que.isEmpty()) {
            int[] cur = que.poll();
            int y = cur[0];
            int x = cur[1];
            int level = cur[2];

            if (y==n-1 && x==m-1) return level;

            for (int i=0; i<4; i++) {
                int ny = y+dy[i];
                int nx = x+dx[i];
                if(ny >= 0 && ny < n && nx >= 0 && nx < m && maps[ny][nx] == 1) {
                    maps[ny][nx]=0;
                    que.offer(new int[]{ny,nx,level+1});
                }
            }
        }

        return -1;
    }
}