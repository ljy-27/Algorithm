package programmers.lv2;

class Programmers_다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);

        while (true) {
            if (count == Integer.bitCount(++n)) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}