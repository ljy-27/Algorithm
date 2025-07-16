package programmers.lv2;

import java.util.*;

class Programmers_할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int len = discount.length;

        for (int i=0; i<=len-10; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (int j=0; j<10; j++) {
                map.put(discount[i+j], map.getOrDefault(discount[i+j],0)+1);
            }

            boolean flag = true;
            for (int k=0; k<want.length; k++) {
                if (number[k] > map.getOrDefault(want[k],0)) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;
        }

        return answer;
    }
}