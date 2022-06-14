class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        while (head != null) {
            temp = head.next;
        }
        return head;
    }
}