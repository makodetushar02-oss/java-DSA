package Que;

import java.util.LinkedList;
import java.util.Queue;

public class introOfQueue {
    static void main(String[] args) {
       MyQueue q = new MyQueue();
//       Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
        q.size();
        System.out.println(q);
        q.clear();
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}
