public class ReverseString
{
    public  void Reverse(char[] s)
    {
        int l = 0, r = s.Length-1;
        while (l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}