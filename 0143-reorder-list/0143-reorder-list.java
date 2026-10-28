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
    public void reorderList(ListNode head) 
    {
        if(head == null || head.next == null)
            return;

        ListNode mid = getMid(head);
        ListNode head2 = reverseList(mid); //After reversing the mid will not be at the start of the 2nd part
        ListNode head1 = head;
        

        while(head1!=null && head2!=null)
        {
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;

            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }

        //Setting next of tail to null
        if(head1 != null)
            head1.next=null;

    }

    //Finding the middle of the list
    static ListNode getMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }


    //Reversing the list
    static ListNode reverseList(ListNode head)
    {
        if(head == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;

        ListNode nextNode = curr.next;

        while(curr!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = nextNode;

            if(nextNode!=null)
                nextNode = nextNode.next;
        }

        return prev;

    }
}