package programmers.lv1;

class Programmers_최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int a=1, b;

        for (int i=2; i<n+m; i++) {
            while (n%i==0 && m%i==0) {
                n = n/i;
                m = m/i;
                a = a*i;
            }
        }
        b = a*n*m;

        return new int[] {a,b};
    }
}