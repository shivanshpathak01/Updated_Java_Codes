package Stacks_and_Queues_CW;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queues = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            queues.add(i);
        }
        System.out.println(queues.size());
        System.out.println(queues);
    }
}
