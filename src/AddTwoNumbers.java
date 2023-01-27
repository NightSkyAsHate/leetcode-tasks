public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(9, new ListNode(9));
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode v = null;
        ListNode c = null;
        boolean plus = false;
        while (l1 != null || l2 != null) {
            int v1 = 0;
            int v2 = 0;
            if (l1 != null)
                v1 = l1.val;
            if (l2 != null)
                v2 = l2.val;
            int sum = v1 + v2;
            if (plus) {
                sum += 1;
                plus = false;
            }
            if (sum >= 10)
                plus = true;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            if (v == null) {
                v = new ListNode(sum % 10);
                c = v;
            } else {
                c.next = new ListNode(sum % 10);
                c = c.next;
            }
            if (l1 == null && l2 == null && plus)
                c.next = new ListNode(1);
        }
        return v;
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
}
