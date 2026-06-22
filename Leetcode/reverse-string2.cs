public class ReverseStringII
{
    public string ReverseStr(string s, int k)
    {

        char[] arr = s.ToCharArray();
        for (int i = 0; i < arr.Length; i+= 2*k)
        {
            int l = i, r = Math.Min(i + k - 1, arr.Length - 1);
            while (l < r)
            {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        return new string(arr);
    }
}