package programmers.lv2;

class Programmers_타겟넘버 {
    public static int answer = 0;
    public static int n;
    public static int static_target;
    public static int[] static_numbers;

    public int solution(int[] numbers, int target) {
        n = numbers.length;
        static_target=target;
        static_numbers=numbers;
        DFS(0, 0);
        return answer;
    }

    public static void DFS(int depth, int sum) {
        if (depth == n) {
            if (static_target == sum) answer++;
            return;
        }

        DFS(depth+1, sum+static_numbers[depth]);
        DFS(depth+1, sum-static_numbers[depth]);
    }
}