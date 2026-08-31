class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        if(p.length() > s.length())
            return list;

        int[] freqP = new int[26]; //for frequency of string P
        int [] freqS = new int[26]; //For frequency of string S

        //calculate frequency of string P
        for(char ch : p.toCharArray())
        {
            freqP[ch - 'a']++;
        }

        int left=0, right=p.length() -1 ;

        for(char ch : s.substring(left,right+1).toCharArray())
        {
            freqS[ch - 'a']++;
        }

        while(right < s.length())
        {

            if(Arrays.equals(freqP,freqS))
                list.add(left);


            freqS[s.charAt(left) - 'a']--;      //Decreasing the freq of character at left index
            left++;

            right++;

            if (right < s.length())
                freqS[s.charAt(right) - 'a']++;     //Adding the frequency of new character            

        }

        return list;
    }
}