package problem1;
import java.util.HashMap;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int i = 0; i < nums.length; i++) {
            
            int complement = target - nums[i];

            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            
            map.put(nums[i], i);
        }


        return new int[0];
    }

    public static void main(String[] args) {
        Problem1 solution = new Problem1();
        int[] result1 = solution.twoSum(new int[] {2, 7, 11, 15}, 9); 
        int[] result2 = solution.twoSum(new int[] {3, 2, 4}, 6);       
        int[] result3 = solution.twoSum(new int[] {3, 3}, 6);          
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");
        System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]");
    }
}
