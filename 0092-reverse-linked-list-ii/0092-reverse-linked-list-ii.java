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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(left == right)
        {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        //Skip left - 1 nodes
        for(int i=0 ; curr!=null && i<left - 1 ; i++)
        {
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev;
        ListNode newEnd = curr; //curr is now on left index

        //Now reverse the list from to till right and also connect the nodes before left and after right to the reversed part 

        ListNode nextNode = curr.next;

        for(int i=0; curr!=null && i<right - left + 1 ; i++)
        {
            curr.next = prev;
            prev=curr;
            curr = nextNode;

            if(nextNode!=null)
                nextNode= nextNode.next;
        }

        if(last != null)    //if the swapping does not start from 1st node then link 1st node with reverserd nodes
            last.next = prev;

        else
            head = prev;

        newEnd.next = curr;
        return head;

    }
}