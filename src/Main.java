import java.util.*;
class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        while (t-- > 0) {
            list.add(new ArrayList<>());
            list.add(Collections.singletonList(sc.nextInt()));
        }
        System.out.println(list);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for( int i =0 ; i <= n-2 ; i++){
            if( i > 0 && nums[i] == nums[i-1] ) continue ;
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i] +  nums[j] +  nums[k];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(temp);

                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1] ) j++;
                    while (j< k && nums[k] == nums[k+1]) k--;
                }
                else if(sum < 0) j++;
                else k--;
            }
        }
        return list ;
    }
}
