package programmers.lv1;

import java.util.*;

class Programmers_자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        while (n!=0) {
            list.add((int) (n%10));
            n = n/10;
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}