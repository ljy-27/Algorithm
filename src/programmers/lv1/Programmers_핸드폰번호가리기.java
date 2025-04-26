package programmers.lv1;

class Programmers_핸드폰번호가리기 {
    public String solution(String phone_number) {

        StringBuilder sb = new StringBuilder(phone_number);

        for (int i=0; i<phone_number.length()-4; i++) {
            sb.replace(i, i+1,"*");
        }

        String answer = sb.toString();
        return answer;
    }
}