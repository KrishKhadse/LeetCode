/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        //Checking if the cycle exists
        ListNode fast= head;
        ListNode slow = head;
        int length=0;

        if(head==null || head.next==null)   //Check for Empty LL
        {
            return null;      
        }

        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow=slow.next;

            if (fast == slow)
            {
                length = findLength(fast , slow);
                break;  //When cycle found break and take 1 round of the cycle  to count the number of nodes in it
            }
        }

        
        if(length == 0)      //Means no cycle is present
            return null;

        //Finding the Start of the Cycle 
        ListNode f = head;
        ListNode s = head;

        while(length>0)
        {
            s = s.next;
            length--;
        }

        while(f != s)
        {
            f=f.next;
            s=s.next;
        }
        return f;   //returning f and not fast
    }

    static int findLength(ListNode fast , ListNode slow)
    {
        //Counting the number of nodes in cycle
        ListNode temp = slow;
        int count = 0;

        do
        {
            temp = temp.next;
            count++;        //Lastly contains the length of the cycle
        }
        while(temp != fast);

        return count;
        
    }
}

    