package programmers.lv2;

class Programmers_피보나치수 {
    static int[] check;

    public int solution(int n) {
        check = new int[n+1];
        int answer = this.DFS(n);
        return answer;
    }

    public int DFS(int n) {
        if (check[n]!=0) return check[n];
        else if (n==0) return check[0]=0;
        else if (n==1) return check[1]=1;
        else return check[n] = (DFS(n-1) + DFS(n-2))%1234567;
    }
}