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
    public ListNode reverseList(ListNode head) {
        ListNode mid=head;
        ListNode previous=null;
        while(mid!=null){
            ListNode temp=mid.next;
            mid.next=previous;
            previous=mid;
            mid=temp;
        }
        
        return previous;
    }
}