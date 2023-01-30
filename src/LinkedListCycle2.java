import java.util.HashMap;

public class LinkedListCycle2 {

    public static void main(String[] args) {
//        ListNode l2 = new ListNode(2);
//        ListNode l1 = new ListNode(1);
//        l1.next = l2;
//        l2.next = l1;

        ListNode l4 = new ListNode(-4);
        ListNode l0 = new ListNode(0);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l4.next = l2;
        l0.next = l4;
        l2.next = l0;
        l3.next = l2;

        System.out.println(detectCycle(l3).val);
    }

    public static ListNode detectCycle(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            int hashCode = current.hashCode();
            if (!map.containsKey(hashCode)) {
                map.put(hashCode, current);
            } else {
                return current;
            }
            current = current.next;
        }
        return current;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
