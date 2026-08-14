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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int size = sizeofList(head);

        if(head == null)
            return null;

        if(n == size)
        {
            head = head.next;
            return head;
        }

        ListNode prev = head;
        ListNode currNode = head.next; 

        for(int i = 2 ; i < (size - n + 1) ; i++)
        { 
            // ListNode nextNode = currNode.next;
            prev = currNode;
            currNode = currNode.next;
        }

        prev.next=currNode.next;
        return head;
    }

    static int sizeofList(ListNode head)
    {
        ListNode curr = head;

        int size = 0;

        while(curr!=null)
        {
            curr = curr.next;
            size++;
        }

        return size;
    }
}