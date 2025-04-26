package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11728_배열합치기 {

    private void solution(int n, int m, int[] A, int[] B) {
        StringBuilder sb = new StringBuilder();
        int pA=0, pB=0;

        while (pA<n && pB<m) {
            if (A[pA]<B[pB]) {
                sb.append(A[pA++]+" ");
            }
            else {
                sb.append(B[pB++]+" ");
            }
        }

        if (pA==n) {
            for (int i = pB; i<m; i++) {
                sb.append(B[i]+" ");
            }
        }
        if (pB==m) {
            for (int i = pA; i<n; i++) {
                sb.append(A[i]+" ");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        BOJ_11728_배열합치기 T = new BOJ_11728_배열합치기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] A = new int[n];
        int[] B = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        T.solution(n, m, A, B);
    }
}