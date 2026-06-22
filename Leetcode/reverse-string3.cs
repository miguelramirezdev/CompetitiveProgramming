public string ReverseStr(string str)
{
        
    char[] arrayOfLetters = str.ToCharArray();
    string[] words = str.Split(' ');
    int[] indexes = new int[words.Length];

    indexes[0] = words[0].Length;
    for (int i = 1; i < indexes.Length; i++)
    {
        indexes[i] = indexes[i-1] + words[i].Length + 1;
    }
    int l = 0, r = 0;
    for (int i = 0; i < words.Length; i++)
    {
        r = indexes[i]-1;
        while (l < r)
        {
                
            char temp = arrayOfLetters[l];
            arrayOfLetters[l] = arrayOfLetters[r];
            arrayOfLetters[r] = temp;
            l++;
            r--;
        }
        l = indexes[i] + 1;
    }
    return new string(arrayOfLetters);
}