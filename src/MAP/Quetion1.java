package MAP;

import java.util.HashMap;
import java.util.Scanner;

public class Quetion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+ 1);
//            }
//            else{
//                map.put(arr[i],1);
//            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
    }
}
