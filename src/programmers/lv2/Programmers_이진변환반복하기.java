package programmers.lv2;

import java.util.*;

public class Programmers_이진변환반복하기 {
    static int countConversion = 0;
    static int countRemoval = 0;

    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (sb.length() > 1) {
            sb.replace(0, sb.length(), removeZero(sb));
            sb.replace(0, sb.length(), conversion(sb));
            countConversion++;
        }
        return new int[]{countConversion, countRemoval};
    }

    String removeZero(StringBuilder sb) {
        char[] arr = sb.toString().toCharArray();
        sb.setLength(0);
        for (char c : arr) {
            if (c == '0') countRemoval++;
            else sb.append(c);
        }
        return sb.toString();
    }

    String conversion(StringBuilder sb) {
        int len = sb.toString().length();
        String binary = Integer.toBinaryString(len);
        return binary;
    }
}

class Programmers_이진변환반복하기2 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() > 1) {

            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '0') answer[1]++;
                else cnt++;
            }

            s = Integer.toBinaryString(cnt);
            answer[0]++;
        }

        return answer;
    }
}