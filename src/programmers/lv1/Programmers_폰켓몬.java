package programmers.lv1;

import java.util.*;

class Programmers_폰켓몬 {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() <= answer) answer = set.size();

        return answer;
    }
}