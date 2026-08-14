class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0)
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) //Checking till the element from  where the there are enough characters to check entire needle string
        {
            int j = 0;

            while (j < needle.length()) {

                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                j++;
            }

            if (j == needle.length())
                return i;
        }

        return -1;
    }
}