package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15655_N과M6 {

    static int n;
    static int m;
    static int[] nums;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        arr = new int[m];
        sb = new StringBuilder();

        DFS(0,-1);
        System.out.println(sb);
    }

    public static void DFS(int depth, int index) {
        if (depth==m) {
            for (int i=0; i<m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=0; i<n; i++) {
            if (index>=i) continue;
            arr[depth]=nums[i];
            DFS(depth+1, i);
        }
    }
}