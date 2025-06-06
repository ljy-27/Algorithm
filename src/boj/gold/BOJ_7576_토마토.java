package boj.gold;

import java.util.*;

class BOJ_7576_토마토 {
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};
    static int[][] board, day;
    static int N, M;
    static Queue<Point> que = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();
        board = new int[N][M];
        day = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int value = scanner.nextInt();
                board[i][j] = value;
                if (value == 1) que.offer(new Point(i, j));
            }
        }
        System.out.print(solution());
    }

    static int solution() {
        BFS();
        for (int[] row : board) {
            for (int val : row) {
                if (val == 0) return -1;
            }
        }
        int answer = 0;
        for (int[] row : day) {
            for (int val : row) {
                answer = Math.max(val, answer);
            }
        }
        return answer;
    }

    static void BFS() {
        while (!que.isEmpty()) {
            Point cur = que.poll();
            for (int i = 0; i < 4; i++) {
                int x = cur.x + dx[i];
                int y = cur.y + dy[i];
                if (x >= 0 && y >= 0 && x < N && y < M && board[x][y] == 0) {
                    board[x][y] = 1;
                    que.offer(new Point(x, y));
                    day[x][y] = day[cur.x][cur.y] + 1;
                }
            }
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}