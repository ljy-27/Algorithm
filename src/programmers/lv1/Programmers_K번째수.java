package programmers.lv1;

import java.util.*;

class Programmers_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int[] answer = new int[n];
        List<Integer> temp = new ArrayList<>();

        for (int i=0; i<n; i++) {
            temp.clear();
            for (int j=commands[i][0]; j<=commands[i][1]; j++) {
                temp.add(array[j-1]);
            }
            Collections.sort(temp);
            int value = temp.get(commands[i][2]-1);
            answer[i]=value;
        }

        return answer;
    }
}