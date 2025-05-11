package programmers.lv2;

import java.util.*;

class Programmers_최댓값과최솟값 {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int count = nums.length;
        int[] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(arr);
        String answer = arr[0] + " " + arr[count-1];
        return answer;
    }
}