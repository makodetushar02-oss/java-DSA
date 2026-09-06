package list.arraylist;

import java.util.Arrays;
import java.util.function.Consumer;
public class MyArrayList {
    int arr[];
    int p;
    MyArrayList(){
        arr = new int[5];
        p = -1;
    }
    public void ensureCapacity(){
        if (p+1 == arr.length){
            arr = Arrays.copyOf(arr, size()*2);
        }
    }
    public void add(int val) {
        ensureCapacity();
        arr[++p] = val;
    }
    public void add(int index, int val) {
        if (index < 0 || index > p+1){
            throw new ArrayIndexOutOfBoundsException("for index : " + index + " and for size : " + size());
        }
        ensureCapacity();
        //shift
        for (int i = p; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        //put val at index
        arr[index] = val;
        p++;
    }
    public void addFirst(int val) {
        add(0, val);
    }
    public void remove(int index) {
        if (index < 0 || index > p){
            throw new ArrayIndexOutOfBoundsException("for index : " + index + " and for size : " + size());
        }
        //shift
        for (int i = index; i < p; i++) {
            arr[i] = arr[i+1];
        }
        p--;
    }
    public void remove(int index ,int val) {
            if (index < 0 || index > p+1){
                throw new ArrayIndexOutOfBoundsException("for index : " + index + " and for size : " + size());
            }
            //shift
            for (int i = p; i >= index; i--) {
                arr[i] = arr[i-1];
            }
            p--;
    }
    public void removeLast() {
        remove(size() - 1);
    }
    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException(
                    "for index : " + index + " and for size : " + size());
        }
        return arr[index];
    }
    public int size() {
        return p+1;
    }
    public boolean contains(int val) {
        for (int i = 0; i < size(); i++) {
            if (arr[i] == val) return true;
        }
        return false;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= p ; i++) {
            sb.append(arr[i]);
            if (i != p)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
    public void addLast(int val) {
        add(size(), val);
    }
    public boolean isEmpty() {
        return p == -1;
    }
    public void forEach(Consumer<Integer> action) {
        for (int i = 0; i < size(); i++) {
            action.accept(arr[i]);
        }
    }
}
