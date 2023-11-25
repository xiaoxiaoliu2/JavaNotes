import java.util.HashMap;
import java.util.Map;

/**
 * leecode1
 */
public class leecode1 {
/**1、两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出和为目标值 target  的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
*/
    // 哈希表方法
    public int[] twoSum(int[] nums, int target){
        int len = nums.length;
        Map<Integer, Integer> hashMap = new HashMap<>(target -1);
        hashMap.put(nums[0],0);
        for (int i = 1; i < len; i++) {
            int another = target - nums[i];
            if (hashMap.containsKey(another)){
                return new int[]{i, hashMap.get(another)};
            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    //暴力求解
    public int[] twoSum1(int[] nums, int target) {
        int len = nums.length;
        for (int m = 0; m < len-1; m++) {
            for (int n = m +1; n < len; n++) {
                if (nums[m] +nums[n] == target) {
                    return new int[]{m, n};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}



