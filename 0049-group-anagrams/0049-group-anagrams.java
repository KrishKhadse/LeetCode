class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {

        //HashMap that stores freq of elements as key and strings that matches the frequency are considered anagrams which are then added in the value of that same key.

        HashMap<String , ArrayList<String> > map = new HashMap<>();

        for(String word: strs)
        {
            int[] count = new int[26];
            for(char ch : word.toCharArray())
            {
                // int index = ch - 'a';
                // count[index]++; below is same in one line
                
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);
            if(map.containsKey(key) )
            {
                map.get(key).add(word);
            }
            else
            {
                map.put(key, new ArrayList<>());
                 map.get(key).add(word);
            }
            
        }

        return new ArrayList<>( map.values() );
    }
}