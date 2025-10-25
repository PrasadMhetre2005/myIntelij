package DSAbyShraddha.Arrays;

public class MergeTwoLists {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // Create a dummy node to simplify merging
            ListNode dummy = new ListNode(0);
            ListNode cur = dummy;

            // Traverse both lists
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    cur.next = list1;
                    list1 = list1.next;
                } else {
                    cur.next = list2;
                    list2 = list2.next;
                }
                cur = cur.next;
            }

            // Attach the remaining part of the non-empty list
            cur.next = (list1 != null) ? list1 : list2;

            // Return the merged list (skipping dummy node)
            return dummy.next;
        }
    }

    // Optional: Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();

        // list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Merge
        ListNode merged = sol.mergeTwoLists(list1, list2);

        // Print merged list: 1 -> 1 -> 2 -> 3 -> 4 -> 4
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
