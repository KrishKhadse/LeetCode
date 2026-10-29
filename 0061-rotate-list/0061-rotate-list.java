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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(k<=0 || head == null || head.next == null)
        {
            return head;
        }

        ListNode last = head;
        int length = 1;

        while(last.next != null)
        {
            last =last.next;
            length++;
        }

        last.next = head;   //Connected the last node with the head

        int rotations = k % length; //If rotations to make k=8 length=6 so the result of list after 6 rotations will be same as the original list, after which only two rotations are required so rather than making 8 rotations if we % it by length then the resukt will be same as required.

        int skip = length - rotations; //Nodes to skio from head

        ListNode newLast = head;
        for(int i=0; i < skip - 1 ; i++)    //Reaching one element before the no of rotations 
        {
            newLast = newLast.next;
        }

        head = newLast.next;    //Making the next node after newLast as head
        newLast.next = null;    //Making newLast.next as null
        
        return head;
        
    }
}