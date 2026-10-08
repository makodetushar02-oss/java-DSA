package LinkedList;

import java.util.LinkedList;

public class methodesOfLinkedList {
    static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.addFirst(23);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
    }
}
