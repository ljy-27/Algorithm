package programmers.lv2;

import java.util.*;

class Programmers_다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> bridge = new ArrayDeque<>();
        int currentWeight = 0;
        int index = 0;
        int time = 0;

        while (index<truck_weights.length || !bridge.isEmpty()) {
            time++;

            if (!bridge.isEmpty() && bridge.peek().time == time) {
                currentWeight -= bridge.poll().weight;
            }

            if (index<truck_weights.length) {
                if(truck_weights[index] + currentWeight <= weight
                        && bridge.size() < bridge_length) {

                    bridge.offer(new Truck(truck_weights[index], time + bridge_length));
                    currentWeight += truck_weights[index];
                    index++;

                }
            }
        }

        return time;
    }
}

class Truck {
    int weight;
    int time;

    public Truck(int weight, int time) {
        this.weight = weight;
        this.time = time;
    }
}