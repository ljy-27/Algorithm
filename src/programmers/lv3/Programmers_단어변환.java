package programmers.lv3;

import java.util.*;

class Data {
    String word;
    int lv;

    public Data(String word, int lv) {
        this.word=word;
        this.lv=lv;
    }
}

class Programmers_단어변환 {
    public int solution(String begin, String target, String[] words) {
        for (String word : words) {
            if (word.equals(target)) {
                return BFS(begin, target, words);
            }
        }
        return 0;
    }

    public int BFS(String begin, String target, String[] words){
        Queue<Data> que = new ArrayDeque<>();
        que.offer(new Data(begin, 0));
        while (!que.isEmpty()) {
            Data temp = que.poll();
            if (temp.word.equals(target)) return temp.lv;
            for (String word : words) {
                int count=0;
                for (int i=0; i<word.length(); i++) {
                    if (word.charAt(i)==temp.word.charAt(i)) count++;
                }
                if (count==word.length()-1) que.offer(new Data(word, temp.lv+1));
            }
        }
        return 0;
    }
}