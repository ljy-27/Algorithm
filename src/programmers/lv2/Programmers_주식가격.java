package programmers.lv2;

import java.util.*;

class Programmers_주식가격 {
    public int[] solution(int[] prices) {
        Stack<Stock> stack = new Stack<>();
        int[] answer = new int[prices.length];

        for (int i=0; i<prices.length; i++) {
            Stock stock = new Stock(i, prices[i], 0);

            for (Stock s : stack) {
                s.time++;
            }

            while (!stack.isEmpty() && stack.peek().price>prices[i]) {
                Stock temp = stack.pop();
                answer[temp.index] = temp.time;
            }

            stack.push(stock);
        }

        while (!stack.isEmpty()) {
            Stock temp = stack.pop();
            answer[temp.index] = temp.time;
        }

        return answer;
    }
}

class Stock {
    int index;
    int price;
    int time;

    public Stock(int index, int price, int time) {
        this.index = index;
        this.price = price;
        this.time = time;
    }
}