

import java.util.ArrayList;

public class ArrList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(2, 100);
        System.out.println(list);
        System.out.println(list.size());
        list.add(4,50);
        System.out.println(list);
        list.remove(2 );
        System.out.println(list);
        list.remove(Integer.valueOf(20));
        System.out.println(list);
        System.out.println(list.contains(12));
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        list.forEach(n -> System.out.println(n*2));
    }
}