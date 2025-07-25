package boj.silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_7568_덩치 {

    static List<Person> list;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new Person(scanner.nextInt(), scanner.nextInt()));
        }

        solution();
        for (Person p : list) {
            System.out.print(p.rank + " ");
        }
    }

    static void solution() {
        for (int i = 0; i < list.size(); i++) {
            Person temp = list.get(i);
            int rank = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                Person comparison = list.get(j);
                if (temp.weight < comparison.weight && temp.height < comparison.height) rank++;
            }
            temp.rank = rank;
        }
    }
}

class Person {
    int weight;
    int height;
    int rank;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}