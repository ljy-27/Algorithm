package programmers.lv2;

class Programmers_멀리뛰기 {
    static int[] dy;

    public int solution(int n) {
        dy = new int[n+1];
        return DFS(n);
    }

    static int DFS(int n) {
        if (dy[n]!=0) return dy[n];
        else if (n==1) return dy[1]=1;
        else if (n==2) return dy[2]=2;
        else return dy[n] = (DFS(n-1) + DFS(n-2)) % 1234567;
    }
}