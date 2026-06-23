public int CountPairs(IList<int> nums, int target)
{
    var numbers = nums.ToList();
    numbers.Sort();

    int left = 0 , right = numbers.Count() - 1, count = 0;

    while (left < right) {
        if (numbers[left] + numbers[right] < target)
        {
            count += right - left;
            left++;
        }
        else
        {
            right--;
        }
    }
    return count;
}