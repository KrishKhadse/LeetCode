class Solution {
    public boolean areOccurrencesEqual(String s) 
    {
        HashMap <Character,Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }

        int frequency = -1;

        for(int freq : map.values())
        {
            if(frequency == -1)
                frequency = freq;
            else if(freq != frequency)
                return false;
        }

        return true;
        
    }
}