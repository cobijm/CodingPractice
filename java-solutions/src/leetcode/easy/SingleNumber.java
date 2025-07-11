package easy;

import java.util.HashMap;

/*
 * 136. Single Number
 */
public class SingleNumber {

	public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == 1) {
                result = nums[i];
                break;
            }
        }
        return result;
    }

}
