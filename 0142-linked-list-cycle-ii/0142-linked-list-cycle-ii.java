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
    public ListNode detectCycle(ListNode head) {
         ListNode fast = head;
         ListNode slow = head;
       //  ListNode match = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
           // match = match.next;

            if (fast == slow){
                ListNode match = head;

               // slow = match;
            while (slow != match) {
                slow = slow.next;
                match = match.next;
            }
            return match;
            }
        }
        return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna