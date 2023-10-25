package algo.algorithm.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Emergency_Room {

    public int solution(int n, int m, int[] risk){
        int answer=1;
        Queue<Person> queue = new LinkedList<>();
        for (int i=0; i<n; i++){
            queue.offer(new Person(i, risk[i]));
        }
        while (!queue.isEmpty()){
            Person tmp = queue.poll();
            for (Person person : queue) {
                if (tmp.getPriority()< person.getPriority()) {
                    queue.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp!=null){
                if (tmp.getId()==m) return answer;
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Emergency_Room T = new Emergency_Room();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] risk = new int[n];
        for (int i=0; i<n; i++){
            risk[i]=scanner.nextInt();
        }
        System.out.print(T.solution(n,m,risk));
    }
}

class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }
}