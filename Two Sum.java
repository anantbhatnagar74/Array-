# Sum up to Target in Array

// Two Sum Calculation using Brute Force Approach or Hash Table.
// Return the indices along with values from the array that sum up to target value.

import java.util.Arrays;
public class Two_Sum 
{
    public static int[] findTwoSum(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) 
        {
            int sum = nums[left] + nums[right];
            if (sum == target) 
            {
                return new int[]{left, right};
            } 
            else if (sum < target) 
            {
                left++;
            } 
            else 
            {
                right--;
            }
        }
        return new int[0];
    }
    public static void main(String[] args) 
    {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = findTwoSum(nums, target);
        if (result.length == 2) 
        {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Values: [" + nums[result[0]] + ", " + nums[result[1]] + "]");
        } 
        else 
        {
            System.out.println("No valid pair found.");
        }
    }
}
Output : Indices: [0, 3]
         Values: [2, 15]
