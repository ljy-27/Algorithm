package boj.gold;

import java.util.*;

class BOJ_1644_소수의연속합 {

    static int N;
    static boolean[] isPrime;
    static List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        isPrime = new boolean[N+1];
        getPrimes(N);
        System.out.print(solution(N));
    }

    public static int solution(int N) {
        int answer = 0;
        int sum = 0;
        int lt = 0, rt = 0;
        while (true) {
            if (sum >= N) {
                sum -= primes.get(lt++);
            } else if (rt == primes.size()) {
                break;
            } else {
                sum += primes.get(rt++);
            }

            if (sum == N) answer++;
        }
        return answer;
    }

    public static void getPrimes(int n) {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }
    }
}