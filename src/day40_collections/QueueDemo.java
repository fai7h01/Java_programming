package day40_collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); //  does not accept null, does not have index
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90)); // natural order, ascending order
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
       // queue1.addAll(Arrays.asList(null, null, null));

        System.out.println(queue1);

        int num1 = queue1.poll(); // ===> FIFO (first-in first-out) order
        System.out.println(queue1);

        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);

       // System.out.println(queue1.get(4));

        System.out.println("----------------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // insertion order preserved, does not accept null, does not have index
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
       // queue1.addAll(Arrays.asList(null, null, null));

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);

       // System.out.println(queue2.get(3));

        System.out.println("----------------------------------------------------------------");

        Queue<Integer> queue3 = new LinkedList<>(); // insertion order is preserved, has index numbers, accepts null
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(null, null, null));


        System.out.println(queue3);

        queue3.poll();

        System.out.println(queue3);

        System.out.println(((LinkedList)queue3).get(4));

        System.out.println("----------------------------------------------------------------");

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(1));

        System.out.println(list);

        System.out.println(((LinkedList)list).poll());

        System.out.println(list);

       // ((Stack)list).pop(); // FIFO; exception

    }
}
