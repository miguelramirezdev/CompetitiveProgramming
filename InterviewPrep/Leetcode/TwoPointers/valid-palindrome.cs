public class ValidPalindrome
{
    public string CleanString(string s)
    {
        var result = new StringBuilder();

        foreach (char c in s)
        {
            if (char.IsLetterOrDigit(c))
            {
                result.Append(c);
            }
        }

        return result.ToString();
    }
    public bool isPalindrome(string s)
    {
        string validString = CleanString(s).ToLower();
        int l = 0, r = validString.Length - 1;
        
        while (l <= r){
            if (validString[l] != validString[r])
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}