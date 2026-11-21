package LinkedList;


public class ListNode {
    public int data;
    public ListNode next;

    public ListNode (int data) {
        this.data = data;
    }

    static void main(String[] args) {
//        singly linked list .
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(30);
        ListNode l4 = new ListNode(40);
        ListNode l5 = new ListNode(50);
        ListNode l6 = new ListNode(60);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode head = l1;
        print(head);
        System.out.println();
        Rec(head);
    }

    private static void Rec(ListNode head) {
        ListNode temp = head;
        if (temp == null) return;
        if(temp.next != null) {
            System.out.print(temp.data + " -> ");
        }else  {
            System.out.print(temp.data);
        }
        Rec(temp.next);

    }

    private static void print(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            if(temp.next != null) {
                System.out.print(temp.data + " -> ");
            }else  {
                System.out.print(temp.data);
            }
            temp = temp.next;
        }
    }
}
