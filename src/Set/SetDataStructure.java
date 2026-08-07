package Set;
import java.util.HashSet;

//HashSet or set
class SetDataStructure{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        for(Integer i:set){
            System.out.println(i);
        }
        System.out.println(set);
        set.remove(30);
        System.out.println(set);
        System.out.println(set.contains(30));
        set.clear();
        System.out.println(set);
    }
}