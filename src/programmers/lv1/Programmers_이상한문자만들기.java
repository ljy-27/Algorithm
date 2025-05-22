package programmers.lv1;

class Programmers_이상한문자만들기 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ",-1);
        for (String str : arr) {
            char[] chars = str.toCharArray();
            for (int i=0; i<chars.length; i++) {
                if (i%2==1) chars[i] = Character.toLowerCase(chars[i]);
                else chars[i] = Character.toUpperCase(chars[i]);
            }
            sb.append(new String(chars)).append(" ");
        }

        sb.deleteCharAt(s.length());
        return sb.toString();
    }
}

class Programmers_이상한문자만들기2 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(' ');
                idx = 0;
            } else {
                if (idx % 2 == 0) sb.append(Character.toUpperCase(c));
                else sb.append(Character.toLowerCase(c));
                idx++;
            }
        }

        return sb.toString();
    }
}