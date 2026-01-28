import java.util.ArrayDeque;

public class Deque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(1);
        dq.offer(2);
        dq.offer(3);
        dq.offer(4);
        dq.offer(5);

        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        dq.poll();
        System.out.println(dq);
        dq.peekFirst();
        System.out.println(dq);
        dq.peekLast();
        System.out.println(dq);
    }
}

/*
 In deque we add element from the last and also from the first, and we can remove element from the first and also from the last.
 Methods -
1. offer() - adds in end
2. offerFirst() - adds in front
3. offerLast() - adds in end
4. poll() - removes from front
5. pollFirst() - removes from front
6. pollLast() - removes from last
7.
*/
