public int FindFinalValue(int[] nums, int original)
{
    int l = 0, r = nums.Length - 1;

    while (l <= r) { 
        if(nums[l] != original) {
            l++;
            continue;
        }
        else
        {
            original *= 2;
            l = 0;
        }
    }
    return original;
}