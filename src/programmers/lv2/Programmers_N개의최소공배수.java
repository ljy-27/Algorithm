package programmers.lv2;

import java.util.Arrays;

//반복문
class Programmers_N개의최소공배수 {
    public int solution(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            arr[i+1] = LCM(arr[i], arr[i+1]);
        }
        return arr[arr.length-1];
    }

    static int LCM(int a, int b) {
        return (a*b) / GCD(a,b);
    }

    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

//재귀
class Programmers_N개의최소공배수2 {
    static int[] arr;

    public int solution(int[] arr) {
        this.arr = arr;
        return DFS(0,1);
    }

    static int DFS(int depth, int result) {
        if (depth==arr.length) return result;
        result = LCM(arr[depth], result);
        return DFS(depth+1, result);
    }

    static int LCM(int a, int b) {
        return (a*b) / GCD(a,b);
    }

    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

//Stream
class Programmers_N개의최소공배수3 {
    public int solution(int[] arr) {
        return Arrays.stream(arr)
                .reduce((a, b) -> LCM(a, b))
                .getAsInt();
    }

    private int LCM(int a, int b) {
        return (a*b) / GCD(a,b);
    }

    private int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}