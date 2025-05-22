package programmers.lv1;

class Programmers_크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        for (int start=0; start<t.length()-p.length()+1; start++) {
            if (t.charAt(start)<=p.charAt(0)) {
                String t_slice = t.substring(start, start+p.length());
                if (Long.parseLong(t_slice)<=Long.parseLong(p)) answer++;
            }
        }
        return answer;
    }
}