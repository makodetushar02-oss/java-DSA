package Que;

import java.util.Arrays;

public class MyQueue {
    int data[];
    int rear ;
    MyQueue(){
        data = new int[5];
        rear = -1;
    }
    MyQueue(int n){
        data = new int[n];
        rear = -1;
    }

    public void offer(int i) {
        if(rear+1 == data.length){
            System.out.println("Queue is full");
        }
        data[++rear] = i;
    }

    public Integer peek() {
        if(rear == -1){
            System.out.println("Queue is empty");
            return null;
        }
        return data[0];
    }

    public Integer poll() {
        if(rear == -1){
            System.out.println("Queue is empty");
            return null;
        }
        int removed = data[0];
//        shifting
        for (int j = 0; j < rear; j++) {
            data[j] = data[j+1];
        }
        data[rear] = 0;
        return  removed;
    }

    @Override
    public String toString() {
        return  Arrays.toString(data) ;
    }

    public Integer size() {
        return rear+1;
    }

    public void clear() {
        rear = -1;
    }

    public boolean isEmpty() {
        if(rear == -1){
            return true;
        }else {
            return false;
        }
    }
}
