public class mid_of_LINKEDLIST {
    public static void main(String[] args) {
        class Solution {
            public ListNode middleNode(ListNode head) {
                ListNode slow = head;
                ListNode fast = head;

                while(fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow;
            }
        }
    }
}
