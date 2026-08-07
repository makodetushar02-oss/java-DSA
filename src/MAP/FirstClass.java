package MAP;

import java.util.HashMap;
import java.util.Map;

public class FirstClass {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(2, "five");
        System.out.println(map);
        map.remove(2);
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.containsKey("five"));
        System.out.println(map.containsValue(1));
//        Traversing through key
        for(int key : map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }
//        Traversing through value
        for (String value : map.values()) {
            System.out.println(value);
        }
//        Traverse map via entry
        for( Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
