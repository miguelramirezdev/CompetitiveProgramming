public class ContainsDuplicate
{
    public bool Solution(int[] nums)
    {
        Dictionary<int, int> duplicates = new Dictionary<int, int>();

        foreach (int num in nums)
        {
            if (!duplicates.TryAdd(num, 1))
            {
                duplicates[num]++;
            }
        }

        foreach (var entry in duplicates)
        {
            if (entry.Value >= 2)
            {
                return true;
            }
        }
        return false;
    }
}