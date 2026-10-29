/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(k<=1 || head == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;

        while(true)
        {
            //Checking if there are k nodes available to reverse
            ListNode checkKNodes = curr;
            for(int i=0 ; i<k ; i++)
            {
                if(checkKNodes == null)
                    return head;
                
                checkKNodes = checkKNodes.next;
            }

            //If k nodes are available then reverse that group 
            ListNode last = prev;
            ListNode newEnd = curr;

            ListNode nextNode = curr.next;

            for (int i = 0;  curr!=null && i< k; i++) 
            {
                curr.next = prev;
                prev = curr;

                curr = nextNode;

                if(curr!= null)
                    nextNode = curr.next;
            }

            if(last != null)    //last Contains the first node before reversal which is then connected to remainig part of list as it becomes last node after reversing 
                last.next = prev;
            else
                head = prev;
            
            newEnd.next = curr; //Joining link between last node of current group and first node of next group after reversing current group

            if(curr == null)
                break;

            prev = newEnd;
        }

        return head;
    }
}

    