package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15654_N과M5 {

    static int n;
    static int m;
    static int[] nums;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        nums = new int[n];
        visited = new boolean[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        arr = new int[m];
        sb = new StringBuilder();

        DFS(0);
        System.out.println(sb);
    }

    public static void DFS(int depth) {
        if (depth==m) {
            for (int i=0; i<m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                visited[i]=true;
                arr[depth]=nums[i];
                DFS(depth+1);
                visited[i]=false;
            }
        }

    }
}