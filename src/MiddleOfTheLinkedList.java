public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        ListNode l6 = new ListNode(6, null);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        System.out.println(middleNode(l1).val);
    }

    public static ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        int targetIndex = size / 2;
        current = head;
        for (int i = 0; i < targetIndex; i++) {
            current = current.next;
        }
        return current;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
