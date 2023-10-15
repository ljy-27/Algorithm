package algo.algorithm.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Class_President {

    public char solution(int n, String result){
        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : result.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max=0;
        for (Character key : map.keySet()) {
            if (map.get(key)>max) {
                max=map.get(key);
                answer=key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Class_President T = new Class_President();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = scanner.next();
        System.out.print(T.solution(n, result));
    }
}
