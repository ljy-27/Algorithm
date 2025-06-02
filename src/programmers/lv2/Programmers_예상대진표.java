package programmers.lv2;

class Programmers_예상대진표 {
    public int solution(int n, int a, int b) {
        int answer = 0;
        boolean flag = true;
        if (a>b) {
            int temp = b;
            b = a;
            a = temp;
        }
        if (Math.abs(a-b)==1 && a%2==1) return 1;

        while (flag) {
            if (a%2==1) a = (a+1)/2;
            else a = a/2;
            if (b%2==1) b = (b+1)/2;
            else b = b/2;
            answer++;
            if (Math.abs(a-b)==1 && a%2==1) flag = false;
        }
        return answer+1;
    }
}