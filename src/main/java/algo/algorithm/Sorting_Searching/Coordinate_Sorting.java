package algo.algorithm.Sorting_Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coordinate_Sorting {

    public static void main(String[] args) {
        Coordinate_Sorting T = new Coordinate_Sorting();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            arr.add(new Point(scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(arr);
        for (Point point : arr) {
            System.out.println(point.x + " "+ point.y);
        }
    }
}

class Point implements Comparable<Point>{
    public int x, y;

    @Override
    public int compareTo(Point o) {
        if (this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}