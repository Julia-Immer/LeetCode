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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Notes: add the current two nodes, plus carry over
        // iterate through lists till both next is null
        // only advance and grab next nodes if not null
        ListNode result = new ListNode(0); // our new result vector
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode sum = result;
        
        // add current nodes together while there are still numbers to add
        while (curr1 != null || curr2 != null) {
            if (curr1 != null) {
                sum.val += curr1.val;
                curr1 = curr1.next;
            }
            if (curr2 != null) {
                sum.val += curr2.val;
                curr2 = curr2.next;
            }
            
            int carry = sum.val/10; // floor division to get ten's place
            
            if (carry > 0 || curr1 != null || curr2 != null) {
                sum.next = new ListNode(carry); // add carry to next node in sum
            }
            
            sum.val = sum.val%10; // put in one's place result
            sum = sum.next; // advance result pointer to next in list
        }

        return result;
    }
}