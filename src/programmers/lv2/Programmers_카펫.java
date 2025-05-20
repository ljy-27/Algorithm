package programmers.lv2;

class Programmers_카펫 {
    public int[] solution(int brown, int yellow) {
        int n, m=0;

        for (int i=1; i<2000000; i++) {
            int b = brown;
            int y = yellow;
            if (i*i - 2*i -b*i/2 + b + y == 0) {
                m = i;
                break;
            }
        }

        n = brown/2 + 2 - m;
        return new int[] {n, m};
    }
}
//n,m n*2+m*2-4=brown
//(n-2)*(m-2)=yellow