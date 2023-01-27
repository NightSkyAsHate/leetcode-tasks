public class MergeTwoSortedLists {

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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(3);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;

        ListNode head = mergeTwoLists(l1, l2);
        print(head);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = null;
        ListNode head = null;
        while (true) {
            Integer v1 = list1 == null ? null : list1.val;
            Integer v2 = list2 == null ? null : list2.val;
            if (v1 == null && v2 == null) {
                return head;
            }
            if (v1 == null) {
                if (newNode == null) {
                    newNode = list2;
                    head = list2;
                } else {
                    newNode.next = list2;
                    newNode = newNode.next;
                }
                list2 = list2.next;
                continue;
            }
            if (v2 == null) {
                if (newNode == null) {
                    newNode = list1;
                    head = list1;
                } else {
                    newNode.next = list1;
                    newNode = newNode.next;
                }
                list1 = list1.next;
                continue;
            }
            if (v1 < v2) {
                if (newNode == null) {
                    newNode = list1;
                    head = list1;
                } else {
                    newNode.next = list1;
                    newNode = newNode.next;
                }
                list1 = list1.next;
            } else {
                if (newNode == null) {
                    head = list2;
                    newNode = list2;
                } else {
                    newNode.next = list2;
                    newNode = newNode.next;
                }
                list2 = list2.next;
            }
        }
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
