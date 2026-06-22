public class Solution {
    public double MinimumAverage(int[] nums) {
        Array.Sort(nums);
        int left = 0;
        int right = nums.Length - 1;
        double minAverage = double.MaxValue;
        while (left <= right)
        {
            double currentAverage = (nums[left] + nums[right]) / 2.0;
            minAverage = Math.Min(minAverage, currentAverage);
            left++;
            right--;    
        }

        return minAverage;
    }
}