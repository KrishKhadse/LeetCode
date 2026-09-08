class Solution {
    public boolean areOccurrencesEqual(String s) 
    {
        HashMap <Character,Integer> map = new HashMap<>();
        HashSet <Integer> set = new HashSet<>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }

        for(int freq : map.values())
        {
            set.add(freq);
        }

        if(set.size()>1)
            return false;

        return true;
        
    }
}