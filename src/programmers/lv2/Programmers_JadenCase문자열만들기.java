package programmers.lv2;

class Programmers_JadenCase문자열만들기 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ", -1);
        for (String str : arr) {
            if (str.equals("")) sb.append(" ");
            else {
                String head = str.substring(0,1);
                String tail = str.substring(1);
                sb.append(head.toUpperCase());
                sb.append(tail.toLowerCase());
                sb.append(" ");
            }
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

class Programmers_JadenCase문자열만들기2 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isStart = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                isStart = true;
            } else {
                if (isStart) {
                    sb.append(Character.toUpperCase(c));
                    isStart = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        return sb.toString();
    }
}