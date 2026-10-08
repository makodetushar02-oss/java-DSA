package LinkedList;

public class MyLinkedList {
    ListNode head;
    int size;

    MyLinkedList(){
        head = null;
        size = 0;
    }

    public void add(int data) {
        add(size, data);
    }
    public void add(int index, int data) {
        if (index < 0 || index > size){
            System.out.println("Out of Bound");
            return;
        }
        if (index == 0){
            addFirst(data);
            return;
        }
        index--;
        ListNode node = new ListNode(data);
        ListNode temp = head;

        while (index-- > 0){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;

        size++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        ListNode temp = head;
        while (temp != null){
            sb.append(temp.data);
            if (temp.next != null)
                sb.append(", ");
            temp = temp.next;
        }


        sb.append("]");

        return sb.toString();
    }

    public void remove(int i) {
        if (i < 0 || i >= size) {
            System.out.println("Out of Bound");
            return;
        }
        if (i == 0) {
            removeFirst();
            return;
        }
        ListNode temp = head;
        while (--i > 0) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        remove(size - 1);
    }
}