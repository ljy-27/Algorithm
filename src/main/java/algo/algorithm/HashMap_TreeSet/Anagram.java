package algo.algorithm.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public String solution(String str1, String str2){
        String answer="YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (Character c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for (char c : str2.toCharArray()) {
            if (!map1.containsKey(c) || map1.get(c)==0) return "NO";
            map1.put(c, map1.get(c)-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Anagram T = new Anagram();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.print(T.solution(str1, str2));
    }
}
