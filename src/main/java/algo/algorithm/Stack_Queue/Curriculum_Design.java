package algo.algorithm.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum_Design {

    public String solution(String essential, String subject){
        String answer="NO";
        Queue<Character> essen = new LinkedList<>();
        for (Character c : essential.toCharArray()) essen.offer(c);
        for (Character c : subject.toCharArray()) {
            if (essen.peek()==c) essen.poll();
        }
        if (essen.isEmpty()) return "YES";
        return answer;
    }

    public static void main(String[] args) {
        Curriculum_Design T = new Curriculum_Design();
        Scanner scanner = new Scanner(System.in);
        String essential = scanner.next();
        String subject = scanner.next();
        System.out.print(T.solution(essential, subject));
    }

    public String solution2(String essential, String subject){
        String answer="YES";
        Queue<Character> essen = new LinkedList<>();
        for (Character c : essential.toCharArray()) essen.offer(c);
        for (char c : subject.toCharArray()) {
            if (essen.contains(c)){
                if (c!=essen.poll()) return "NO";
            }
        }
        if (essen.isEmpty()) return "NO";
        return answer;
    }
}
