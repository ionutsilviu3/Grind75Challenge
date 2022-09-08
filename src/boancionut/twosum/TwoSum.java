package boancionut.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int x = target - numbers[i];            // x resembles the difference between the target number and the current number in the array
            if (seen.containsKey(x))                // if x exists in the map, that means we have found a sum that results our target
                                                    // because x + the current number = target
                return new int[]{seen.get(x), i};

            seen.put(numbers[i], i);                // if x does not exist in the map, we put the current number in the map
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
