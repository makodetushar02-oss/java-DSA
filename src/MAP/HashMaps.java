package MAP;
import java.util.*;
public class HashMaps {
    static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(null, null);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.remove(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue(null));
        System.out.println(map.containsKey("five"));
        System.out.println(map.get(null));
        // iterate on map over key
        for(int key : map.keySet()) System.out.println(key);
        // iterate on map over val
        for(String val : map.values()) System.out.println(val);
        // iterate on map over entry Set
        for(Map.Entry<Integer , String> key : map.entrySet()) System.out.println(key);
    }
}
