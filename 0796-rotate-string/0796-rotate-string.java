class Solution {
    public boolean rotateString(String s, String goal) {
        
        String res;

        if(goal.length() == s.length())
        {
            res = s + s;
        }
        else
            return false;
        

        if(res.contains(goal))
        {
            return true;
        }
        return false;
    }
}