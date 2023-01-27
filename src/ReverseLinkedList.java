public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        print(reverseList(l1));
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        while (head != null) {
            prev = new ListNode(head.val, prev);
            head = head.next;
        }
        return prev;
    }
    public static void print(ListNode n) {
        while(n.next != null) {
            System.out.printf("val - %s, next -> ", n.val);
            n = n.next;
        }
        System.out.println();
    }
}
