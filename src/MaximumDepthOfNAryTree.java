import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumDepthOfNAryTree {

    public static void main(String[] args) {
//        Node n5 = new Node(5, null);
//        Node n6 = new Node(6, null);
//        List<Node> arr1 = new ArrayList<>();
//        arr1.add(n5);
//        arr1.add(n6);
//        Node n3 = new Node(3, arr1);
//        Node n2 = new Node(2, null);
//        Node n4 = new Node(4, null);
//        List<Node> arr2 = new ArrayList<>();
//        arr2.add(n3);
//        arr2.add(n2);
//        arr2.add(n4);
//        Node n1 = new Node(1, arr2);
//        System.out.println(maxDepth(n1));

        Node n44 = new Node(44, null);
        System.out.println(maxDepth(n44));
    }

    public static int maxDepth(Node root) {
        int maxSize = 0;
        int currentSize = root == null ? 0 : 1;
        Stack<Node> callStack = new Stack<>();
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.children != null && !currentNode.children.isEmpty()) {
                callStack.add(currentNode);
                currentNode = currentNode.children.get(0);
                currentSize++;
                if (maxSize < currentSize) {
                    maxSize = currentSize;
                }
            } else {
                if (currentNode == root && callStack.isEmpty()) {
                    break;
                }
                currentNode = callStack.pop();
                currentNode.children.remove(0);
                currentSize--;
            }
        }
        return Math.max(maxSize, currentSize);
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
