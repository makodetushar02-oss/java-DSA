package Stack;

import java.util.Arrays;

public class StackUsingArr {
    int[] arr;
    int top;
    StackUsingArr() {
        arr = new int[5];
        top = -1;
    }

    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    public Integer peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top];
    }

    public Integer pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        int value = arr[top];
        top--;
        return value;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top ; i++) {
            sb.append(arr[i]);
            if (i != top)
                sb.append(", ");
        }
        sb.append("]");


        return sb.toString();
    }
    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
