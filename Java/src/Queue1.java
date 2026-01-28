import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
    }
}

/*
 Queue adds element in the end and removes element from the first. It is FIFO data structure.
Methods -
1. offer() -> to add element in the queue
2. poll() -> to remove an element from the front
3. peek() -> to know which next element in going to poll
*/