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
    public ListNode removeElements(ListNode head, int val) 
    {
        if(head==null)
            return null;

        ListNode dummy = new ListNode(0,head);  //constructor is defined in program

        ListNode currNode = dummy;

        while(currNode.next != null)
        {
            if(currNode.next.val == val)    
            //If next value is the target then bypass it, the pointer does not move forward directly after removing target, it first checks again if the current.next node is the target 

                currNode.next = currNode.next.next;

            else
                currNode = currNode.next;   //Else move pointer forward to next node
        }

        return dummy.next;
        
    }
}