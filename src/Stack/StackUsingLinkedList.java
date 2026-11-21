package Stack;

import LinkedList.ListNode;

public class StackUsingLinkedList {
     ListNode head;
    private int size;
    StackUsingLinkedList() {
        head = null;
        size = 0;
    }

    public void push(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        size++;
    }

    public Integer peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public Integer pop() {
        if (head == null) {
             return null;
          }
          int val = head.data;
          head = head.next;
          size--;
          return val;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print(){
        while (head.next == null){
            System.out.print(head.data + ", ");
            head = head.next;
        }
    }
}

