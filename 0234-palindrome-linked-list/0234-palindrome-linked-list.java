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
    public boolean isPalindrome(ListNode head) 
    {
        //1. find mid  2.reverse 2nd part using prev and curr 3.compare using two pointers

        ListNode mid = getMid(head);
        ListNode secondHead = mid;

        ListNode prev = mid;
        ListNode curr = mid.next;

       

        while(curr != null)
        {
            ListNode nextNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        secondHead.next = null;
        secondHead = prev;

        ListNode list1 = head;
        ListNode list2 = secondHead;

        while(list1 != mid && list2!= null)
        {
            if(list1.val != list2.val)
                return false;

            list1 = list1.next;
            list2 = list2.next;
        }
        return true;
    }

    static ListNode getMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}