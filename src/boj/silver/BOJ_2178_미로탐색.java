package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178_미로탐색 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n, m;
    static int[][] maze;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.print(BFS());
    }

    static int BFS() {
        Point start = new Point(0, 0, 1);
        Queue<Point> que = new ArrayDeque<>();
        que.offer(start);
        visited[0][0] = true;
        while (!que.isEmpty()) {
            Point cur = que.poll();

            if (cur.row == n-1 && cur.col == m-1) return cur.level;

            for (int i=0; i<4; i++) {
                int row = cur.row + dy[i];
                int col = cur.col + dx[i];
                if (row >= 0 && row < n && col >= 0 && col < m && maze[row][col] == 1 && !visited[row][col]) {
                    que.offer(new Point(row, col, cur.level + 1));
                    visited[row][col] = true;
                }
            }
        }

        return 0;
    }
}

class Point {
    int row, col;
    int level;
    public Point(int row, int col, int level) {
        this.row = row;
        this.col = col;
        this.level = level;
    }
}