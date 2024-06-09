package Java_CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(10);
        adq.offerFirst(20);
        adq.offerLast(30);
        adq.peekFirst();
        System.out.println(adq);
    }
}
