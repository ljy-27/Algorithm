package algo.algorithm.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Find_All_Anagrams {

    public int solution(String str, String ana){
        int answer=0;
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> strMap = new HashMap<>();
        for (char c : ana.toCharArray()) {
            aMap.put(c, aMap.getOrDefault(c,0)+1);
        }
        int strLength = str.length();
        int anaLength = ana.length();
        char[] arr = str.toCharArray();
        for (int i=0; i<anaLength-1; i++){
            strMap.put(arr[i], strMap.getOrDefault(arr[i],0)+1);
        }
        int lt=0;
        for (int rt=anaLength-1; rt<strLength; rt++){
            strMap.put(arr[rt], strMap.getOrDefault(arr[rt],0)+1);
            if (aMap.equals(strMap)) answer++;
            strMap.put(arr[lt], strMap.get(arr[lt])-1);
            if (strMap.get(arr[lt])==0) strMap.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Find_All_Anagrams T = new Find_All_Anagrams();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String ana = scanner.next();
        System.out.print(T.solution(str, ana));
    }
}
