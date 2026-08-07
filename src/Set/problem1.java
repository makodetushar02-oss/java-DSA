package Set;

import java.util.HashSet;

public class problem1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {2,1,3,1,2,4,5,6,5,2,2,3,6};
        for (int i = 0; i < arr.length; i++) {
             if(set.contains(arr[i])){
                 set.remove(arr[i]);
             }else {
                 set.add(arr[i]);
             }
        }
        System.out.println(set);
    }
}
