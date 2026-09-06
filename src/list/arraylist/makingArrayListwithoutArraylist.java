package list.arraylist;

public class makingArrayListwithoutArraylist {
    static void main(String[] args) {
        MyArrayList list = new MyArrayList();
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
        list.removeLast();
        System.out.println(list);
        list.addLast(23);
        list.remove(Integer.valueOf(2));
        System.out.println(list);
        System.out.println(list.contains(23));
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        list.forEach(n -> System.out.println(n*2));
    }
}
