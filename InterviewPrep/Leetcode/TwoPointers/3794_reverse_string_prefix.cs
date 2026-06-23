public class Solution {
    public string ReversePrefix(string s, int k) {
        if (k == 1)
            return s;
        int right = k-1;
        int left = 0;
        char[] chars = s.ToCharArray();
        while (left < right)
        {
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
        return new string(chars);
    }
}